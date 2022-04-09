package com.codekul.JavaSpring.onetoone.repository;

import com.codekul.JavaSpring.onetoone.model.Adhar;
import org.springframework.data.jpa.repository.JpaRepository;

 public interface AadharRepository extends JpaRepository <Adhar, Integer> {
}
