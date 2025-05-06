package com.joseph.jpa.database_connect.course;

import com.joseph.jpa.database_connect.course.jpa.CourseJpaRepository;
import com.joseph.jpa.database_connect.course.springjpa.CourseSpringJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourceJdbcRepository repository;

//    @Autowired
//    private CourseJpaRepository repository;

    @Autowired
    private CourseSpringJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1,"hello1","course"));
        repository.save(new Course(2,"hello2","course"));
        repository.save(new Course(3,"hello3","course"));
        repository.deleteById(1l);

        System.out.println(repository.findById(2l));
        System.out.println(repository.count());
        System.out.println(repository.existsById(3l));

        System.out.println(repository.findByName("hello2"));
    }
}
