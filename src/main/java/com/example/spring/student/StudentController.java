package com.example.spring.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/student")
public class StudentController {
  private final StudentService studentService;

  @Autowired
  public StudentController(StudentService studentService) {
    this.studentService = studentService;
  }

  @GetMapping
	public List<Student> getStudents() {
		return studentService.getStudents();
	}

  @PostMapping
  public Student saveStudent(@RequestBody Student student) {
    return studentService.createStudent(student);
  }

  @DeleteMapping(path = "{id}")
  public void deleteStudent(@PathVariable("id") Long id) {
    studentService.deleteStudent(id);
  }
}
