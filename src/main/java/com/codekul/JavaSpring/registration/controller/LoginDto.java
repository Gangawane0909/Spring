package com.codekul.JavaSpring.registration.controller;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Getter
@Setter
public class LoginDto {



    private String userName;

    private String Password;



}
