package tn.esprit.app.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Result {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;


	private int correctAnswers;

	private int incorrectAnswers;

	@Temporal(TemporalType.TIMESTAMP)

	private Date startTime;

	@ManyToOne(fetch=FetchType.LAZY)
	private Quiz quiz;
}
