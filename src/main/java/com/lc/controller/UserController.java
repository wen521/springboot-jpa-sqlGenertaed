package com.lc.controller;

import com.lc.entity.User;
import com.lc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/list")
    public List <User>findAll(){
        return userService.findAll();
    }
}
