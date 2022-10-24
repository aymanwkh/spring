package com.example.spring.user;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService {
	private final UserRepo userRepo;

	public List<User> getUsers() {
		return userRepo.findAll();
	}

  public User createUser(User user) {
		var found = userRepo.findByEmail(user.getEmail());
		if (found.isPresent()) {
			System.out.print("email found ....");
			throw new IllegalStateException("email found");
		}
		return userRepo.save(user);
  }

  public void deleteUser(Long id) {
		userRepo.deleteById(id);
  }
}
