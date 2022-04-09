package com.codekul.JavaSpring.colorlib.repository;

import com.codekul.JavaSpring.colorlib.domain.ColorLib;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColorlibRepo extends JpaRepository<ColorLib, Integer> {


}