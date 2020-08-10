package com.hh.perman.controller;

import com.hh.perman.model.User;
import com.hh.perman.rabbitmq.SenderB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testcon {
    @Autowired
    private SenderB senderB;
    @RequestMapping("/test")
    public String ttt2() {
        try {
            User user=new User();
            user.setName("admind");
            user.setAge("28");
            senderB.send(user);
        }catch (Exception e){
            e.printStackTrace();
            return "fail to send";
        }
        return "success to send";
    }
}
