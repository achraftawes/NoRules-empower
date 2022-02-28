package tn.esprit.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.app.entities.Chat;


@Repository
public interface ChatRepository extends CrudRepository<Chat,Long>{

}
