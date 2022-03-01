package tn.esprit.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.app.entity.JobProposer;
@Repository
public interface JobProposerRepository  extends CrudRepository<JobProposer, Integer>{

}
