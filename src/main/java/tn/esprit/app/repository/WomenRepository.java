package tn.esprit.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.app.entities.Women;

@Repository
public interface WomenRepository extends CrudRepository<Women,Long>{

}
