package com.codekul.JavaSpring.servicedemo.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
@Getter
@Setter
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String BankName;

    private  String IfscCode;

    private  String branchName;

}
