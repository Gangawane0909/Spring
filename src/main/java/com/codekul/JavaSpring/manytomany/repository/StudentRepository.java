package com.codekul.JavaSpring.manytomany.repository;

import com.codekul.JavaSpring.manytomany.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
