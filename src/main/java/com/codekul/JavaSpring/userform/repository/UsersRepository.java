package com.codekul.JavaSpring.userform.repository;

import com.codekul.JavaSpring.userform.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users,Integer> {

}
