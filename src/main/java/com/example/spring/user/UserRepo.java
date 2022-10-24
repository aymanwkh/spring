package com.example.spring.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long>{

  @Query("select s from User s where s.email = ?1")
  Optional<User> findByEmail(String email);
  
}
