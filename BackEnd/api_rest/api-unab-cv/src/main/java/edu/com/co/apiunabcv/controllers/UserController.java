package edu.com.co.apiunabcv.controllers;

import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.com.co.apiunabcv.models.UserModel;
import edu.com.co.apiunabcv.services.UserService;


@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("/usuarios")

public class UserController {
    @Autowired
    UserService usuarioService;
    
    @GetMapping
    public ArrayList<UserModel> selectUser(){
        return usuarioService.selectUser();
    }

    @PostMapping
    public UserModel saveUsuario(@RequestBody UserModel usuario){
        return usuarioService.saveUser(usuario);
    }
}