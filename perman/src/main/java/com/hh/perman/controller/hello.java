package com.hh.perman.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class hello {
    @RequestMapping("/tt")
    public String home2() {
        return "Hello / hello2 contr!";
    }
}
