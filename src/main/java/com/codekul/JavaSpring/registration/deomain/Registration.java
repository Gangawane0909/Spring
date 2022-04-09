package com.codekul.JavaSpring.registration.deomain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

//import javax.validation.constraints.NotNull
@Entity
@Getter
@Setter
public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull(message = "first name can not be null")
    @Column(length = 50)
    private String firstName;

    @NotNull(message = "Last name can not be null")
    private String lastName;

    @NotNull(message = "Email can not be null")
    @Email(message = "email should be in correct format")
    private String email;

    @NotNull( message ="User can not be null")
    private String userName;

    @NotNull( message ="password can not be null")
    private String password;

    private Long Contact ;


}

