package tn.esprit.app.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

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
	
	private Long idWomen; 
	private String firstNameWomen;
	private String lastNameWomen;
	private String emailWomen;
	private String pwdWomen;
	private String pictureWomen;
	@ManyToOne
	@JsonIgnore
	Appointement appointement;
}
