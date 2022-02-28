package tn.esprit.app.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
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
public class JobProposer  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idJobP")
	private Integer idJobP; // Clé primaire
	private String firstNameWomen;
	private String lastNameWomen;
	private String emailWomen;
	private Integer numero; 
	@OneToMany( mappedBy="jobproposer")
	@JsonIgnore
	private Set<JobOffers> joboffers;
}
