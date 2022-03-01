package tn.esprit.app.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.app.entity.JobOffers;
@Repository
public interface JobOffersRepository extends CrudRepository<JobOffers, Integer> {
	

}
