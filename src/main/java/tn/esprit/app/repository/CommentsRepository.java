package tn.esprit.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.app.entities.Comments;


@Repository
public interface CommentsRepository extends CrudRepository<Comments,Long>{

}
