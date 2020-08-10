package com.hh.shopp.controller;

import com.hh.shopp.pojo.SpUser;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping(value = "hello")
    public String helloController() {
        return "hello whwww111333";
    }

    @RequestMapping("/Spuser/{id}")
    public SpUser getuser(@PathVariable("id") Long id) {
        return new SpUser(id, "xingming", 25);

    }
}

