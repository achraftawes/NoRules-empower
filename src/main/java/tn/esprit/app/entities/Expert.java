package tn.esprit.app.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
public class Expert implements Serializable {
	/**
	 * 
	 */
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 
	private Long id_expert;
	private String email;
	private String firstname;

	private String lastname;
	private int number;
	@Enumerated(EnumType.STRING)
	private Speciality speciality;
	
	
	@OneToMany( mappedBy="expert")
	@JsonIgnore
	private Set<Appointement> appointement;
	
	
}
