package com.example.demo.service;

import com.example.demo.entity.TbUser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TbUserServices {
    TbUser findById(int id);

    List<TbUser> findAll();

    TbUser save(TbUser TbUser);



    void updateBUser(String username,String password,Integer id);

    void delete(int id);

    Page<TbUser> findAll(Pageable pageable);

    List<TbUser> findbynameandp(String username, String password);

    List<TbUser> findByUsernameLike(String username);

    List<TbUser> findByUsernameAndPassword(String username, String password);

    List<TbUser> findByUsername(String username);

}
