package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: layui
 * @Date: 2019-12-29 22:45
 * @Author: code1990
 * @Description:
 */

@RestController
public class IndexController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
