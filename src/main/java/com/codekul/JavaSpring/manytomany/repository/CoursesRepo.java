package com.codekul.JavaSpring.manytomany.repository;

import com.codekul.JavaSpring.manytomany.domain.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursesRepo extends JpaRepository<Courses, Integer> {
}
