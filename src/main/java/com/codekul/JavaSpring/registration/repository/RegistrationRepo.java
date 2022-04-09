package com.codekul.JavaSpring.registration.repository;

import com.codekul.JavaSpring.registration.deomain.Registration;
import org.springframework.boot.autoconfigure.security.oauth2.client.OAuth2ClientProperties;
import org.springframework.data.jpa.repository.JpaRepository;

;

public interface RegistrationRepo extends JpaRepository<Registration,Integer> {


    Registration findByUserNameAndPassword(String userName, String password);
}
