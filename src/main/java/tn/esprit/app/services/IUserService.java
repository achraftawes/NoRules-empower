package tn.esprit.app.services;

import java.util.List;

import tn.esprit.app.entities.User;

public interface IUserService {
	
	List<User> retrieveAllUsers();

	void deleteUser(Long id);

	User updateUser(User u);

	User retrieveUser(Long id);

}
