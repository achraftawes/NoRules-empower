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
public class Admin implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 
	@Column(name="idAdmin")
	Long idAdmin;
	String firstNameAdmin;
	String lastNameAdmin;
	String emailAdmin;
	String pwdAdmin;
	
	@ManyToOne
	private Posts PostA;
	
	@ManyToMany
	private Set<Chat> chatA;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="AdminC")
	private Set<Comments> Commentss;
	
}
