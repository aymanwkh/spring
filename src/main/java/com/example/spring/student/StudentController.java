package com.example.spring.student;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/student")
public class StudentController {
  @GetMapping
	public List<Student> getStudents() {
		return List.of( new Student("fadi", "fadi@gmail.com", "123"));
	}
}
