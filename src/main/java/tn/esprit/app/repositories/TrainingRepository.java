package tn.esprit.app.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esprit.app.entities.Level;
import tn.esprit.app.entities.Training;

@Repository
public interface TrainingRepository extends JpaRepository<Training, Long>{
	
	
	
	@Query("select t from Training t WHERE t.title LIKE :title AND t.level=:level")
	 Training findByTitleAndLevel (@Param("title") String title , @Param("level") Level level);
	
	 
	 @Query("select  t from Training t WHERE t.title LIKE:title")
	     List<Training> SearchTraining(@Param("title") String title);
	 

}
