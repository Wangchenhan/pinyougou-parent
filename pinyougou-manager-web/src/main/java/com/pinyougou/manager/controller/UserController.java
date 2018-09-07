package com.pinyougou.manager.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/9/6 0006.
 */
@RestController
@RequestMapping("/user")
public class UserController {


    @RequestMapping("/sayHello")
    public String sayHello() {
        System.out.print("今天要出星辰肩");
        return "yes";
    }
}
