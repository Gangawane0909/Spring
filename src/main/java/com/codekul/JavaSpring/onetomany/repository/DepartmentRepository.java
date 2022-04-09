package com.codekul.JavaSpring.onetomany.repository;

import com.codekul.JavaSpring.onetomany.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository <Department,Integer> {

    }

