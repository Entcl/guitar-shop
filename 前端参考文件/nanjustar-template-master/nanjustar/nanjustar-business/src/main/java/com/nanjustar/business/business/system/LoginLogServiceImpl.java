package com.nanjustar.business.business.system;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nanjustar.api.moudle.security.dto.ConsumerDetailDto;
import com.nanjustar.api.moudle.system.api.LoginLogService;
import com.nanjustar.api.moudle.system.dto.LoginLogDto;
import com.nanjustar.api.moudle.system.entity.LoginLog;
import com.nanjustar.api.moudle.system.vo.LoginLogVo;
import com.nanjustar.common.constant.ServiceErrorConst;
import com.nanjustar.common.exception.NanjustarException;
import com.nanjustar.common.result.PageResult;
import com.nanjustar.common.utils.AssertUtil;
import com.nanjustar.common.utils.BeanCopyUtil;
import com.nanjustar.common.utils.IpUtils;
import com.nanjustar.mapper.mapper.system.LoginLogMapper;
import com.nanjustar.mapper.utils.ConsumerUtil;
import eu.bitwalker.useragentutils.UserAgent;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author nanjustar
 * @since 2021-12-04
 */
@Service
public class LoginLogServiceImpl extends ServiceImpl<LoginLogMapper, LoginLog> implements LoginLogService {

    @Override
    public PageResult<LoginLogDto> listLoginLog(LoginLogVo loginLogVo) {
        /*------------------------  开始查询日志信息  -----------------------------*/
        Page<LoginLog> loginLogPage = baseMapper.selectPage(new Page<>(loginLogVo.getCurrent(), loginLogVo.getSize()),
                new LambdaQueryWrapper<LoginLog>()
                        .like(AssertUtil.isNotEmpty(loginLogVo.getNickname()), LoginLog::getNickname, loginLogVo.getNickname())
                        .like(AssertUtil.isNotEmpty(loginLogVo.getIpSource()), LoginLog::getIpSource, loginLogVo.getIpSource())
                        .eq(AssertUtil.isNotNull(loginLogVo.getStatus()), LoginLog::getStatus, loginLogVo.getStatus())
                        .between(AssertUtil.isNotEmpty(loginLogVo.getBeginTime()) && AssertUtil.isNotEmpty(loginLogVo.getEndTime()),
                                LoginLog::getGmtCreate, loginLogVo.getBeginTime(), loginLogVo.getEndTime())
                        .orderByDesc(LoginLog::getGmtCreate));
        /*------------------------  查询日志信息完成  -----------------------------*/
        /*------------------------  数据转换开始  -----------------------------*/
        List<LoginLogDto> loginLogDtos = BeanCopyUtil.copyList(loginLogPage.getRecords(), LoginLogDto.class);
        /*------------------------  数据转换完成  -----------------------------*/
        return new PageResult<>(loginLogDtos, loginLogPage.getTotal());
    }

    @Transactional(rollbackFor = NanjustarException.class)
    @Override
    public void saveLoginLog(HttpServletRequest request, Boolean success) {
        String usename = "";
        String nickname = "";

        if (success) {
            ConsumerDetailDto userDetails = ConsumerUtil.getUserDetails();
            usename = userDetails.getUsername();
            nickname = userDetails.getNickname();
        } else {
            usename = request.getParameter("username");
            nickname = usename;
        }

        String ipAddress = IpUtils.getIpAddress(request);
        String ipSource = IpUtils.getIpSource(ipAddress);
        UserAgent userAgent = IpUtils.getUserAgent(request);

        LoginLog loginLog = LoginLog
                .builder()
                .username(usename)
                .nickname(nickname)
                .ipAddress(ipAddress)
                .ipSource(ipSource)
                .brower(userAgent.getBrowser().getName())
                .os(userAgent.getOperatingSystem().getName())
                .status(success ? 1 : 0)
                .gmtCreate(new Date())
                .remark(success ? "登陆成功！" : "用户名或密码错误！")
                .build();
        /*------------------------  开始添加数据  -----------------------------*/
        int insert = baseMapper.insert(loginLog);
        AssertUtil.sysIsError(insert == 0, ServiceErrorConst.SAVE_DATA_FAIL);
        /*------------------------  添加数据完成  -----------------------------*/
    }
}
