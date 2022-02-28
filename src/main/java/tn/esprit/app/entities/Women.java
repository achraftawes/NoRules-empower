package tn.esprit.app.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Women implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 
	@Column(name="idWomen")
	Long idWomen;
	String firstNameWomen;
	String lastNameWomen;
	String emailWomen;
	String pwdWomen;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="WomenAd")
	private Set<Advertising> Advertisings;
	
	@ManyToMany
	private Set<Chat> chatW;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="WomenC")
	private Set<Comments> Commentss;
	
	@ManyToOne
	private Posts PostW;
	
	
}
