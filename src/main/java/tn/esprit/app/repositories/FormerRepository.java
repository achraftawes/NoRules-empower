package tn.esprit.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.app.entities.Former;

@Repository
public interface FormerRepository extends JpaRepository<Former, Long> {

}
