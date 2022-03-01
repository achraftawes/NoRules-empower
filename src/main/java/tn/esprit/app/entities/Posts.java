package tn.esprit.app.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
public class Posts implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 
	@Column(name="idPost")
	Long idPost;
	String title;
	String imageVideoPost;
	String descriptionPost;
	Integer likes;
	Integer dislikes;
	@Temporal(TemporalType.DATE)
	Date dateCreatedPost;
	
	
	@Enumerated(EnumType.STRING)
	 CategoriePosts categoriePost;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="PostA")
	private Set<Admin> Admins;
	
	//@OneToMany(cascade = CascadeType.ALL, mappedBy="PostW")
	//private Set<Women> Womens;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="PostCo")
	private Set<Comments> Comments;
}
