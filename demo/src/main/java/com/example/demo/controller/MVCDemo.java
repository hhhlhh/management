package com.example.demo.controller;

import com.example.demo.pojo.NeUser;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MVCDemo {
    //@RequestMapping(value = "/mtest/{ui}",method = RequestMethod.GET)
    @GetMapping("mtest")
    public ModelAndView hello() {
        NeUser neUser = new NeUser();
        neUser.setName("namesss");
        neUser.setAge(22);
        neUser.setRole("admin");
        neUser.setId(11);
        //ModelAndView modelAndView=new ModelAndView("mvcde");
        //modelAndView.addObject("neUser",neUser);
        System.out.println(neUser.getRole());
        //System.out.println(ui);
        return new ModelAndView("mvcde", "neUser", neUser);
        // return modelAndView;
    }
}
