package com.joseph.jpa.database_connect.course.springjpa;

import com.joseph.jpa.database_connect.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseSpringJpaRepository extends JpaRepository<Course, Long> {
    List<Course> findByName(String name);

}
