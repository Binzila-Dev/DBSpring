package com.example.DBSpring.repo;

import com.example.DBSpring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
    public User findByUserName(String Username);
}
