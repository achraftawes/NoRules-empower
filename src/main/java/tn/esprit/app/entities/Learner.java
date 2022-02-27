package tn.esprit.app.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Learner {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 
	@Column(name="idLearner")
	private Long idLearner; 
	private String firstName;
	private String lastName;
	private String imgLearner;
	private String email;
	
	@ManyToMany (mappedBy="learners")
	@JsonIgnore
	private Set<Training> trainings ;

}
