package tn.esprit.app.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.app.entity.Women;
@Repository
public interface WomenRepository extends CrudRepository<Women, Long> {

}
