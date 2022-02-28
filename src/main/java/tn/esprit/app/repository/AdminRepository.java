package tn.esprit.app.repository;


import java.util.List; 

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.app.entities.Admin;




@Repository
public interface AdminRepository extends CrudRepository<Admin,Long>{
	
}
