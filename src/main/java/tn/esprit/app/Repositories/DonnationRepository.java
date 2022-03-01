package tn.esprit.app.Repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.app.entities.Donnation;
@Repository
public interface DonnationRepository extends CrudRepository<Donnation, Long> {
	@Query("SELECT COUNT(amount) FROM Donnation d ")
	int nbreDonations();

}
