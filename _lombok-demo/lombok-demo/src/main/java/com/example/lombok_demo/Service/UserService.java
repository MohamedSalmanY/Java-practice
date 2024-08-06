package com.example.lombok_demo.Service;

import com.example.lombok_demo.DAO.UserDao;
import com.example.lombok_demo.DTO.UserRequest;
import com.example.lombok_demo.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userdao;

    public User saveUser(UserRequest userRequest) {
        User user = User.
                build(0, userRequest.getName(), userRequest.getEmail(),
                        userRequest.getMobile(), userRequest.getGender(),
                        userRequest.getAge(), userRequest.getNationality());
        return userdao.save(user);
    }


    public List<User> getALlUsers() {
        return userdao.findAll();
    }


    public User getUser(int id) {
        return userdao.findByUserId(id);
    }

}
