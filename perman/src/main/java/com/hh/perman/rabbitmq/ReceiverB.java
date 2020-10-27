package com.hh.perman.rabbitmq;

import com.hh.perman.model.User;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "fortestq")
public class ReceiverB {
    // @RabbitHandler
    // public void QueueReceiver(String SQueue){
    //     System.out.println("Receive B:"+SQueue);
    //  }
    @RabbitHandler
    public void process(User user) {
        System.out.println("object is  B receive: " + user);
    }
}
