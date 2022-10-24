package com.example.spring.user;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Setter
public class User {
  @Id
  @SequenceGenerator(name= "users_seq", sequenceName = "users_seq", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_seq")
  private Long id;
  public User(String name, String email, String password, String roles) {
    this.name = name;
    this.email = email;
    this.password = password;
    this.roles = roles;
  }
  public Long getId() {
    return id;
  }
  private String name;
  public String getName() {
    return name;
  }
  private String email;
  public String getEmail() {
    return email;
  }
  @JsonIgnore
  private String password;
  public String getPassword() {
    return password;
  }
  private LocalDate created;
  public LocalDate getCreated() {
    return created;
  }
  private LocalDate updated;
  public LocalDate getUpdated() {
    return updated;
  }
  private String roles;
  public String getRoles() {
    return roles;
  }
}
