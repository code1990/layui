package com.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: layui
 * @Date: 2019-12-29 22:45
 * @Author: code1990
 * @Description:
 */

@Controller
public class IndexController {

    /**
     * 根据ID查询用户
     * @param
     * @return
     */
    @ApiOperation(value="获取用户详细信息", notes="根据url的id来获取用户详细信息")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Integer", paramType = "path")
    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
