package com.hh.shopp.pojo;

import lombok.Data;

@Data
public class SpUser {
    private Long id;
    private String name;
    private Integer age;
    public SpUser(Long id,String name,Integer age){
        this.id=id;
        this.name=name;
        this.age=age;
    }
}
