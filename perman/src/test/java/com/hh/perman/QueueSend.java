package com.hh.perman;

import com.hh.perman.rabbitmq.SenderA;
import com.hh.perman.rabbitmq.SenderB;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@SpringBootTest
@RunWith(SpringRunner.class)
public class QueueSend {
    @Autowired
    private SenderA queueSender;
    private SenderB qub;

    @Test
    public void que() {
        int i = 100;
        for (int j = 0; j < i; j++) {
            String msg = "Queue test msg:" + j + new Date();
            try {
                queueSender.send(msg);
//                qub.send(msg);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
