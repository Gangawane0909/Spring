package com.codekul.JavaSpring.userform.controller;

import com.codekul.JavaSpring.userform.domain.Users;
import com.codekul.JavaSpring.userform.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Users1Controller {
    @Autowired
    private UsersRepository userRepository;

    @PostMapping("save1Users")
    public String save1User(@RequestBody Users users) {
        userRepository.save(users);
return "save users...";

    }

}

