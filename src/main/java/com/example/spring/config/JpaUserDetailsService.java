package com.example.spring.config;

import java.util.Arrays;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.spring.user.User;
import com.example.spring.user.UserRepo;

import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor
public class JpaUserDetailsService implements UserDetailsService {
  private final UserRepo userRepo;

  @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
      User user = userRepo.findByEmail(username).orElseThrow(() -> new UsernameNotFoundException("not found"));
      return new SecurityUser(user.getName(), user.getEmail(), user.getPassword(), user.getRoles());
    }
}
