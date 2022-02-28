package tn.esprit.app.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.app.entity.SiteAdministrator;
@Repository
public interface SiteAdministratorRepository extends CrudRepository<SiteAdministrator, Long> {

}
