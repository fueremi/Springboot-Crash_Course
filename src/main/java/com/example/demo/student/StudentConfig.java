package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.Arrays;

import static java.time.Month.NOVEMBER;
import static java.time.Month.OCTOBER;


@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student rian = new Student(
                    "Rian",
                    LocalDate.of(1996, OCTOBER
                            , 18),
                    "rianoktiomersaputra4@gmail.com"
            );
            Student ulvi = new Student(
                    "Ulvi",
                    LocalDate.of(1997, NOVEMBER
                            , 3),
                    "zasvia@gmail.com"
            );

            repository.saveAll(
                    Arrays.asList(rian, ulvi)
            );
        };

    }
}
