package tn.esprit.app.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
public class Appointement implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long idAppointement;
	@Temporal(TemporalType.DATE)
	private Date dateAppointement;
	private String observation;
	
	@OneToMany( mappedBy="appointement")
	@JsonIgnore
	private Set<Expert> expert;
	
	@OneToMany( mappedBy="appointement")
	@JsonIgnore
	private Set<Women> women;

}
