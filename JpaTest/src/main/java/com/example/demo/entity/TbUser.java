package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tbl_user")
public class TbUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String password;
    //@ManyToOne(fetch = FetchType.LAZY,targetEntity = TbClass.class)
    //@JoinColumn(name = "c_id",referencedColumnName = "id")
   // private TbClass tbClass;

    //@ManyToOne(fetch = FetchType.LAZY,optional = false)
   //@JoinColumn(name = "school_id")
   //private School school;

   // @ManyToOne(cascade = CascadeType.ALL,optional = false)
   // @JoinColumn(name = "school_id")
    //@JsonIgnoreProperties(value = "tbUsers")
   // private School school;
}
