package com.hh.info.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class Helloworldmvc {
    @RequestMapping("/hello")
    public String hello(Model model) {
        List mav = null;

        model.addAttribute("fd", mav);

        return "info/hello";
    }
}
