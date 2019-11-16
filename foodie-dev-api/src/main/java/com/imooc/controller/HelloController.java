/**
 * Copyright (c) 2019-2019 All Rights Reserved.
 */
package com.imooc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 陆炎
 * @version : HelloController.java, v0.1 2019/11/16 陆炎 Exp $$
 */
@RestController
public class HelloController {

    @RequestMapping("/test")
    public String test(){
        return "Hello World";
    }
}