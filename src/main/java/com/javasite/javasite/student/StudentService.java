package com.javasite.javasite.student;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Component
public class StudentService {
  
  public List<Student> getStudents() {
    return List.of(
      new Student(
        1L,
        "Mariam",
        "mariam.jamal@mail.ru",
        LocalDate.of(2000, Month.JANUARY, 15),
        21
      )
    );
  }
}
