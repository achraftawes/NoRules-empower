package tn.esprit.app.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.app.entity.Donator;
@Repository
public interface DonatorRepository extends CrudRepository<Donator, Long>{

}
