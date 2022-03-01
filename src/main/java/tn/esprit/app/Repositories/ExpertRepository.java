package tn.esprit.app.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.app.entities.Expert;
@Repository
public interface ExpertRepository extends CrudRepository<Expert, Long> {

}
