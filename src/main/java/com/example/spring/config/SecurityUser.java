package com.example.spring.config;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.spring.user.User;

import java.util.Arrays;
import java.util.Collection;

public class SecurityUser extends User implements UserDetails {

  public SecurityUser(String name, String email, String password, String roles) {
    super(name, email, password, roles);
  }

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    var authorities = Arrays.stream(this.getRoles().split(",")).map(SimpleGrantedAuthority::new).toList();
    return authorities;
  }

  @Override
  public String getUsername() {
    return this.getName();
  }

  @Override
  public boolean isAccountNonExpired() {
    return false;
  }

  @Override
  public boolean isAccountNonLocked() {
    return false;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return false;
  }

  @Override
  public boolean isEnabled() {
    return false;
  }

    
}