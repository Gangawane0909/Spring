package com.codekul.JavaSpring.colorlib.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter

public class ColorLib {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String Firstname;

    private String Lastname;

    private String Company;

    private String Email;

    private Long PhoneNumber;

    private String MealPreference;

    private String PaymentMode;

    private String bankName;

    private String payableAt;





}
