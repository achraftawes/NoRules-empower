package tn.esprit.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.app.entities.Level;
import tn.esprit.app.entities.Training;

@Repository
public interface TrainingRepository extends JpaRepository<Training, Long>{
	
	 Training findByTitle(String title);
	 Training  findByLevel(Level level);
	 

}
