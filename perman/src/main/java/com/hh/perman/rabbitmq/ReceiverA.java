package com.hh.perman.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "fortestq")
public class ReceiverA {
    @RabbitHandler
    public void QueueReceiver(String SQueue){
        System.out.println("Receive A:"+SQueue);
    }
}
