package tn.esprit.app.entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Training {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name="idTraining")
	private Long idTraining; 
	
	private String title;
	
	private String description ;
	
	private String urlTraining ;
	
	private String imgTraining;
	
	private Boolean isAvailable ;

	private Integer nbrHours;
	
	private Integer nbrMaxParticipant;

	@Temporal(TemporalType.DATE)   
	private Date startDate;
	
	@Temporal(TemporalType.DATE)   
	private Date endDate;
	
	@Enumerated(EnumType.STRING) 
	private Level level;
	

	
	@ManyToMany
	@JsonIgnore
	private Set<Learner> learners ;
	
	@ManyToOne
	private Former former;
}
