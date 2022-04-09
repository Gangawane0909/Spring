package com.codekul.JavaSpring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {
    private  Integer id;
    private String companyName;
    private String address;

   // @Autowired
  private Employee employee;

    @Autowired
    public void setEmployee(Employee employee){
        this.employee = employee;
    }
    @Autowired
    public Company(Employee employee){
        this.employee = employee;
    }
    public void showCompanyEmp(){
        employee.empShow();
        employee.empShow();
    }

    }

