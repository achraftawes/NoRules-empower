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
	@Enumerated(EnumType.STRING)
	private Type type;
	
	@ManyToOne
	@JsonIgnore
	Donator donator;
	
	
}
