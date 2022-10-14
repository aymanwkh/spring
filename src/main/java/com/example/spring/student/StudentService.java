package com.example.spring.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	private final StudentRepo studentRepo;
	@Autowired
  public StudentService(StudentRepo studentRepo) {
		this.studentRepo = studentRepo;
	}

	public List<Student> getStudents() {
		return studentRepo.findAll();
	}

	public Student saveStudent() {
		var newStudent = new Student("ahmad", "ahmad@gmail.com", "123");
		return studentRepo.save(newStudent);
	}

  public Student createStudent(Student student) {
		var found = studentRepo.findByEmail(student.getEmail());
		if (found.isPresent()) {
			System.out.print("email found ....");
			throw new IllegalStateException("email found");
		}
		return studentRepo.save(student);
  }

  public void deleteStudent(Long id) {
		studentRepo.deleteById(id);
  }
}
