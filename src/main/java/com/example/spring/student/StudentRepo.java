package com.example.spring.student;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long>{

  @Query("select s from Student s where s.email = ?1")
  Optional<Student> findByEmail(String email);
  
}
