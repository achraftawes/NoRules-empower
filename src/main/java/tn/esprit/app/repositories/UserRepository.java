package tn.esprit.app.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.app.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	User findByUserName(String email);
}
