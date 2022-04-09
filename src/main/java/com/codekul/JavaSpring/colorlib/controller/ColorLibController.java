package com.codekul.JavaSpring.colorlib.controller;

import com.codekul.JavaSpring.colorlib.domain.ColorLib;
import com.codekul.JavaSpring.colorlib.domain.MealPreference;
import com.codekul.JavaSpring.colorlib.repository.ColorlibRepo;
import com.codekul.JavaSpring.colorlib.repository.MealPrefRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ColorLibController {

     @Autowired
    private ColorlibRepo colorlibRepo;

    @Autowired
     private MealPrefRepo mealPrefRepo;


    @PostMapping("saveMeal")
    public  String saveMealPref(@RequestBody MealPreference mealPreference){
        mealPrefRepo.save(mealPreference);
        return "meal pref saved";
    }
    @GetMapping("getMealList")
    public List<MealPreference>getMealPref(){
      return mealPrefRepo.findAll();

    }
    @PostMapping("saveColorLib")
    public String savaColorLib(@RequestBody ColorLib colorLib){
        colorlibRepo.save(colorLib);
        return "color lib saved";

    }


}
