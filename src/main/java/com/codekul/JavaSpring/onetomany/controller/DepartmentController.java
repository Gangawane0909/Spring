package com.codekul.JavaSpring.onetomany.controller;

import com.codekul.JavaSpring.onetomany.model.Department;
import com.codekul.JavaSpring.onetomany.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentRepository departmentRepository;

    @PostMapping("saveDepartment")
    public String saveDepartment(@RequestBody Department department){
        departmentRepository.save(department);
        return "save department";
    }
}
