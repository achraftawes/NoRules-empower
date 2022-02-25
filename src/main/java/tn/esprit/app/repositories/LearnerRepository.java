package tn.esprit.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.app.entities.Learner;

@Repository
public interface LearnerRepository extends JpaRepository<Learner, Long>{

}
