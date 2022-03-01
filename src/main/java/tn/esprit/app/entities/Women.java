package tn.esprit.app.entity;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Women implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idWomen")
	private Integer idWomen; // Clé primaire
	private String firstNameWomen;
	private String lastNameWomen;
	private String emailWomen;
	private String pwdWomen;
	private String pictureWomen;
	@Enumerated (EnumType.STRING)
	private Profession profession ;
	@ManyToOne
	@JsonIgnore
	JobOffers joboffers;
	@OneToOne
	private Subscriptions subscriptions ;

}
