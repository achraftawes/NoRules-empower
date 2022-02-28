package tn.esprit.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.app.entities.Advertising;

@Repository
public interface AdvertisingRepository extends CrudRepository<Advertising,Long>{

}
