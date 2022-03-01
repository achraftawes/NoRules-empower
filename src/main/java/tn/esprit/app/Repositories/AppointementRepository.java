package tn.esprit.app.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.app.entities.Appointement;
@Repository
public interface AppointementRepository extends CrudRepository<Appointement, Long> {
	

}
