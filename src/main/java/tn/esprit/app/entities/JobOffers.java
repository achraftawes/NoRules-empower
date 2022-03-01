package tn.esprit.app.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class JobOffers  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="id_job")
	private Integer id_job; // Clé primaire
	@Temporal(TemporalType.DATE) 
	private Date hire_date;
	@Temporal(TemporalType.DATE)
	private Date termination_date;
	private String description;
	private String type;
	private Integer job_salary;
	@OneToMany( mappedBy="joboffers")
	@JsonIgnore
	private Set<Women> womens;
	@ManyToOne
	@JsonIgnore
	JobProposer jobproposer;
}
