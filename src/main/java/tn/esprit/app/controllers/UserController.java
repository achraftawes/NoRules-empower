package tn.esprit.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.app.entities.User;
import tn.esprit.app.services.IUserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	IUserService userService;

	@GetMapping("/retrieve-all-users")
	@ResponseBody
	public List<User> getUsers() {
		List<User> users = userService.retrieveAllUsers();
		return users;
	}

	@GetMapping("/retrieve-user/{user-id}")
	@ResponseBody
	public User retrieveUser(@PathVariable("user-id") Long userId) {
		return userService.retrieveUser(userId);
	}

	@PostMapping("/add-user")
	@ResponseBody
	public User addUser(@RequestBody User u) {
		User user = userService.addUser(u);
		return user;
	}

	@DeleteMapping("/remove-user/{user-id}")
	@ResponseBody
	public void removeUser(@PathVariable("user-id") Long userId) {
		userService.deleteUser(userId);
	}

	@PutMapping("/modify-user")
	@ResponseBody
	public User modifyClient(@RequestBody User user) {
		return userService.updateUser(user);
	}

}
