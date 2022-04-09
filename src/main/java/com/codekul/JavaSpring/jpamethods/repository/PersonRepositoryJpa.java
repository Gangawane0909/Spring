package com.codekul.JavaSpring.jpamethods.repository;

import com.codekul.JavaSpring.jpamethods.domain.PersonJpa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepositoryJpa extends JpaRepository<PersonJpa,Integer> {
        List<PersonJpa> findByName(String name);

        PersonJpa findByNameAndAddress(String name,String address);

        List<PersonJpa> findByNameOrAddress(String name,String address);

        PersonJpa findByNameStartingWith(String name);

        PersonJpa findByNameEndingWith(String name);
}
