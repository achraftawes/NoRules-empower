package tn.esprit.app.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
public class Donnation implements Serializable {
/**
 * 
 */
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 
	private Long id_donnation;
	private float amount;
	private int quantity;
	private String type;
	
	@OneToMany( mappedBy="donnation")
	@JsonIgnore
	private Set<Donator> donator;
	
	@ManyToOne
	@JsonIgnore
	SiteAdministrator siteadmin;
}
