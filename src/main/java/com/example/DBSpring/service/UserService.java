package com.example.DBSpring.service;

import com.example.DBSpring.model.User;
import com.example.DBSpring.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository repo;

    public void save(User user){
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(12);
        user.setPassWord(bCryptPasswordEncoder.encode(user.getPassWord()));
        repo.save(user);
    }
}
