package tn.esprit.app.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.app.entities.Donator;
@Repository
public interface DonatorRepository extends CrudRepository<Donator, Long>{

}
