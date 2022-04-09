package com.codekul.JavaSpring.colorlib.repository;

import com.codekul.JavaSpring.colorlib.domain.MealPreference;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MealPrefRepo extends JpaRepository<MealPreference,Integer> {
}
