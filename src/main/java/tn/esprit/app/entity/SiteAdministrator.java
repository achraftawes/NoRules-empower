package tn.esprit.app.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
public class SiteAdministrator implements Serializable {
	/**
	 * 
	 */
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 
	private Long id_admin;
	private String email_admin;
	private String firstnameadmin;
	private String lastnameadmin;
	private String pwdadmin;
	
	@OneToMany( mappedBy="siteadmin")
	@JsonIgnore
	private Set<Donnation> donnations;

	

}
