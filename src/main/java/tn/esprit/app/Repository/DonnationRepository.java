package tn.esprit.app.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.app.entity.Donnation;
@Repository
public interface DonnationRepository extends CrudRepository<Donnation, Long> {

}
