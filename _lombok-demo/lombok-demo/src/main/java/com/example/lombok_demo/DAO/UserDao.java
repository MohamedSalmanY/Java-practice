package com.example.lombok_demo.DAO;

import com.example.lombok_demo.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User ,Integer> {


    User findByUserId(int id);
}
