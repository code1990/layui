package com.controller;

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

    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
