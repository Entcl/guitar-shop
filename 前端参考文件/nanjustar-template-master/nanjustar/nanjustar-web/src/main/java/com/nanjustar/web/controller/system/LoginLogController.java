package com.nanjustar.web.controller.system;


import com.nanjustar.api.moudle.system.api.LoginLogService;
import com.nanjustar.api.moudle.system.dto.LoginLogDto;
import com.nanjustar.api.moudle.system.vo.LoginLogVo;
import com.nanjustar.common.result.PageResult;
import com.nanjustar.common.result.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author nanjustar
 * @since 2021-12-04
 */
@RestController
@Api(tags = "用户日志模块")
public class LoginLogController {

    @Autowired
    private LoginLogService loginLogService;

    /**
     * 查询登陆日志信息
     *
     * @param loginLogVo 日志信息vo类
     * @return {@link LoginLogDto} 日志信息
     */
    @ApiOperation(value = "查询登陆日志信息")
    @GetMapping("/loginLog/list")
    public ResponseResult<PageResult<LoginLogDto>> listLoginLog(LoginLogVo loginLogVo) {
        return ResponseResult.success("登陆日志查询成功！", loginLogService.listLoginLog(loginLogVo));
    }

}

