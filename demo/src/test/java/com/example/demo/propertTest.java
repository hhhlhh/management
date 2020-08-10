package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class propertTest {
    //获取配置文件中的age
    @Value("${age}")
    private int age;

    //获取配置文件中的name
    @Value("${myenvironment.name}")
    private String name;

    @Test
    public void getAge() {System.out.println(age);
    }

    @Test
    public void getName() {System.out.println(name);
    }


}