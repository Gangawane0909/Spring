package com.codekul.JavaSpring.onetoone.controller;

import com.codekul.JavaSpring.onetoone.model.Adhar;
import com.codekul.JavaSpring.onetoone.model.Person;
import com.codekul.JavaSpring.onetoone.repository.AadharRepository;
import com.codekul.JavaSpring.onetoone.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

        @Autowired
        private AadharRepository adharRepository;

        @Autowired
        private PersonRepository personRepository;

        @PostMapping("savePerson")
        public String savePerson() {

             Person person =new Person();
            Adhar adhar = new Adhar();

            person.setName("Shradha");
            person.setEmail("sgangawane1999@gmail.com");

            adhar.setAdharNumber(125433294890L);
            adhar.setAddress("Pune");
            adhar.setContactNumber(7743935570L);

            person.setAdhar(adhar);
            adhar.setPerson(person);

            personRepository.save(person);
            adharRepository.save(adhar);

            return "Person and adhar save";



        }
        @GetMapping("getPersonList")
    public List<Person> getPerson(){
            return personRepository.findAll();




    }
}







