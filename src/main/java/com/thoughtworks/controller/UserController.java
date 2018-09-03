package com.thoughtworks.controller;

import com.thoughtworks.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

	@GetMapping
	public ResponseEntity<List<User>> all() {
		List<User> users = new ArrayList<>();
		users.add(new User("Zhang san", "China"));
		users.add(new User("Steven Jobs", "US"));
 		return ResponseEntity.ok(users);
	}

}
