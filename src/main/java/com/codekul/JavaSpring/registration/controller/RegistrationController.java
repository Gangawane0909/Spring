package com.codekul.JavaSpring.registration.controller;

import com.codekul.JavaSpring.registration.deomain.Registration;
import com.codekul.JavaSpring.registration.repository.RegistrationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class RegistrationController {

    @Autowired
    private RegistrationRepo registrationRepo;

    @PostMapping("register")
    public String register(@Valid @RequestBody Registration registration) {
     registrationRepo.save(registration);
        return "Registered successfully....";
    }

    @PostMapping("login")
    public String login( @RequestBody LoginDto loginDto){

        Registration registration
                = registrationRepo.findByUserNameAndPassword(loginDto.getUserName(),loginDto.getPassword());
        if (registration.getEmail() != null) {
            return "Login successfully....";
        } else {
            return "Login Failed";
        }
    }

}