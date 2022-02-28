package tn.esprit.app.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.app.entity.Expert;
@Repository
public interface ExpertRepository extends CrudRepository<Expert, Long> {

}
