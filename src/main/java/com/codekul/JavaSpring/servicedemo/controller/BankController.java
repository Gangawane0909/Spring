package com.codekul.JavaSpring.servicedemo.controller;

import com.codekul.JavaSpring.servicedemo.domain.Bank;
import com.codekul.JavaSpring.servicedemo.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {

    @Autowired
    private BankService bankService;

    @PostMapping("saveBank")
    public  String saveBank(@RequestBody Bank bank){
        bankService.saveBank(bank);
        return "Bank saved..";
    }

}

