package com.hh.perman.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SenderA {
    @Autowired
    private AmqpTemplate rabbitTemplate;
    public void send(String context){
        System.out.println("sender:"+context);
        this.rabbitTemplate.convertAndSend("fortestq",context);
    }
}
