package com.example.demo.service.impl;

import com.example.demo.entity.TbUser;
import com.example.demo.repository.TbUserRepository;
import com.example.demo.service.TbUserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TbUserServiceImpl implements TbUserServices {
    @Autowired
    TbUserRepository tbUserRepository;

    @Override
    public TbUser findById(int id) {

        return tbUserRepository.findById(id);
    }

    @Override
    public List<TbUser> findAll() {

        return tbUserRepository.findAll();
    }

    @Override
    public TbUser save(TbUser TbUser) {

        return tbUserRepository.save(TbUser);
    }


    @Override
    public void updateBUser(String username, String password, Integer id) {
        tbUserRepository.updatewithUser(username,password,id);
    }

    @Override
    public void delete(int id) {
        tbUserRepository.deleteById(id);
    }

    @Override
    public Page<TbUser> findAll(Pageable pageable) {
        return tbUserRepository.findAll(pageable);
    }

    @Override
    public List<TbUser> findbynameandp(String username, String password) {
        return tbUserRepository.findByUsernameAndPassword(username, password);
    }

    @Override
    public List<TbUser> findByUsernameLike(String username) {
        return tbUserRepository.findByUsernameLike(username);
    }

    @Override
    public List<TbUser> findByUsernameAndPassword(String username, String password) {
        return tbUserRepository.findByUsernameAndPassword(username, password);
    }

    @Override
    public List<TbUser> findByUsername(String username) {
        return tbUserRepository.findByUsername(username);
        //return tbUserRepository.findByPassword(username);
    }
}
