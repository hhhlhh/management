package com.hh.perman.rabbitmq;

import com.hh.perman.model.User;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SenderB {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(User user) {
        System.out.println("sender:" + user.toString());
        this.rabbitTemplate.convertAndSend("fortestq", user);
    }
}
