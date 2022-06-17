package com.nanjustar.api.moudle.system.api;

import com.nanjustar.api.moudle.system.dto.LoginLogDto;
import com.nanjustar.api.moudle.system.entity.LoginLog;
import com.baomidou.mybatisplus.extension.service.IService;
import com.nanjustar.api.moudle.system.vo.LoginLogVo;
import com.nanjustar.common.result.PageResult;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author nanjustar
 * @since 2021-12-04
 */
public interface LoginLogService extends IService<LoginLog> {

    /**
     * 查询登陆日志信息
     * @param loginLogVo 登陆日志信息 vo 类
     * @return {@link LoginLogDto} 登陆日志信息
     */
    PageResult<LoginLogDto> listLoginLog(LoginLogVo loginLogVo);

    /**
     * 新增登陆日志信息
     * @param request request
     * @param success 是否登陆成功
     */
    void saveLoginLog(HttpServletRequest request,Boolean success);
}
