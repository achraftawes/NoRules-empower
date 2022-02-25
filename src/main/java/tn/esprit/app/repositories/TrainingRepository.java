package tn.esprit.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.app.entities.Training;

@Repository
public interface TrainingRepository extends JpaRepository<Training, Long>{

}
