package com.example.spring.student;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Student {
  @Id
  @SequenceGenerator(name= "user_seq", sequenceName = "user_seq", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
  private Long id;
  public Student(String name, String email, String password) {
    this.name = name;
    this.email = email;
    this.password = password;
  }
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  private String name;
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  private String email;
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  private String password;
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  private LocalDate created;
  public LocalDate getCreated() {
    return created;
  }
  public void setCreated(LocalDate created) {
    this.created = created;
  }
  private LocalDate updated;
  public Student(Long id, String name, String email, String password, LocalDate created, LocalDate updated) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.password = password;
    this.created = created;
    this.updated = updated;
  }
  public Student() {
  }
  public LocalDate getUpdated() {
    return updated;
  }
  public void setUpdated(LocalDate updated) {
    this.updated = updated;
  }
  @Override
  public String toString() {
    return "Student [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", created="
        + created + ", updated=" + updated + "]";
  }
  
}
