package tn.esprit.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.app.entities.Posts;

@Repository
public interface PostsRepository extends CrudRepository<Posts,Long>{

}
