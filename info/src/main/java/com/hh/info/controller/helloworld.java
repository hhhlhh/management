package com.hh.info.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloworld {
    @RequestMapping("/hh")
    public String hellowo() throws Exception{

        return "just test";
    }
}
