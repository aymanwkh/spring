package com.example.spring.student;

import java.time.LocalDate;

public class Student {
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
