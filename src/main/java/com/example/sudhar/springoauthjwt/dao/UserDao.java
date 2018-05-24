package com.example.sudhar.springoauthjwt.dao;

import com.example.sudhar.springoauthjwt.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(String username);
}