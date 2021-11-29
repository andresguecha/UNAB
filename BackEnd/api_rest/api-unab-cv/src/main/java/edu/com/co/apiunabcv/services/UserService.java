package edu.com.co.apiunabcv.services;

import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.com.co.apiunabcv.models.UserModel;
import edu.com.co.apiunabcv.repositories.UserRepository;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public ArrayList <UserModel> selectUser (){
        return (ArrayList<UserModel>) userRepository.findAll();
    }

    public UserModel saveUser (UserModel user){
        return userRepository.save(user);
    }

    
    
}
