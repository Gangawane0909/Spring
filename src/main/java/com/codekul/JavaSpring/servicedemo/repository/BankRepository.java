package com.codekul.JavaSpring.servicedemo.repository;

import com.codekul.JavaSpring.servicedemo.domain.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends JpaRepository<Bank,Integer> {
}
