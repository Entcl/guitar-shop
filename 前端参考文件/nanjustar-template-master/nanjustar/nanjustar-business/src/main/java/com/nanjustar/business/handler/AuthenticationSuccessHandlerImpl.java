package com.nanjustar.business.handler;

import com.alibaba.fastjson.JSON;
import com.nanjustar.api.moudle.security.dto.ConsumerDetailDto;
import com.nanjustar.api.moudle.system.api.LoginLogService;
import com.nanjustar.api.moudle.system.entity.LoginLog;
import com.nanjustar.common.constant.ServiceErrorConst;
import com.nanjustar.common.utils.AssertUtil;
import com.nanjustar.common.utils.IpUtils;
import com.nanjustar.mapper.mapper.system.LoginLogMapper;
import com.nanjustar.mapper.utils.ConsumerUtil;
import com.nanjustar.common.constant.SystemConst;
import com.nanjustar.common.result.ResponseResult;
import com.nanjustar.common.utils.JwtTokenUtil;
import eu.bitwalker.useragentutils.UserAgent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 用户登陆 成功 处理器
 */
@Component
public class AuthenticationSuccessHandlerImpl implements AuthenticationSuccessHandler {

    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private LoginLogService loginLogService;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
        loginLogService.saveLoginLog(httpServletRequest, true);
        httpServletResponse.setContentType("application/json; charset=UTF-8");
        httpServletResponse.getWriter().write(JSON.toJSONString(ResponseResult.success(SystemConst.LOGIN_SUCCESS, "Bearer " + jwtTokenUtil.generatorToken(ConsumerUtil.getUserDetails()))));
    }

}
