package tn.esprit.app.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.app.entity.Charityevent;

@Repository
public interface CharityeventRepository extends CrudRepository<Charityevent, Long> {

}
