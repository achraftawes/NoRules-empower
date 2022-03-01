package tn.esprit.app.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.app.entities.Charityevent;

@Repository
public interface CharityeventRepository extends CrudRepository<Charityevent, Long> {

}
