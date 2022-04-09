package com.codekul.JavaSpring.validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class ValidationController {

    @Autowired
    private ValidationRepo validationRepo;

    @PostMapping("saveValidation")
    public ResponseEntity< ? > saveValidationFrom(@Valid @RequestBody ValidationDemo validationDemo){
        ValidationDemo validationDemo1 = validationRepo.save(validationDemo);
        return new ResponseEntity<>(validationDemo1, HttpStatus.CREATED);
    }
}
