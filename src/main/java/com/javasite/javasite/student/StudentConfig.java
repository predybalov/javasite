package com.javasite.javasite.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.JANUARY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mariam = new Student(
                    "Mariam",
                    "mariam.jamal@mail.ru",
                    LocalDate.of(2000, JANUARY, 15)
            );

            Student alex = new Student(
                    "Alex",
                    "alex@mail.ru",
                    LocalDate.of(1990, JANUARY, 20)
            );

            repository.saveAll(
                    List.of(mariam, alex)
            );
        };
    }
}
