package com.codekul.JavaSpring.onetoone.repository;

import com.codekul.JavaSpring.onetoone.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository <Person,Integer> {
}
