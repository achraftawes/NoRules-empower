package tn.esprit.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import tn.esprit.app.entities.User;
import tn.esprit.app.repositories.UserRepository;

@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	private UserRepository userRepository;
	BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

	public User findUserByUserName(String userName) {
		return userRepository.findByUserName(userName);
	}

	public User saveUser(User user) {
		user.setPwd(bCryptPasswordEncoder.encode(user.getPwd()));
		user.setActive(true);
		return userRepository.save(user);
	}

	@Override
	public List<User> retrieveAllUsers() {
		return (List<User>) userRepository.findAll();
	}

	@Override
	public User addUser(User u) {
		return userRepository.save(u);
	}

	@Override
	public void deleteUser(Long id) {
		User user = userRepository.findById(id).get();
		userRepository.delete(user);
	}

	@Override
	public User updateUser(User u) {
		return userRepository.save(u);
	}

	@Override
	public User retrieveUser(Long id) {
		return userRepository.findById(id).get();
	}

}
