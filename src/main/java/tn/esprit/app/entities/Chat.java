package tn.esprit.app.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

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
public class Chat implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 
	@Column(name="idChat")
	long idChat;
	String text;
	String sendTo;
	String sendFrom;
	
	@ManyToMany(mappedBy = "chatA", cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
	@JsonIgnore
	Set<Admin> Admin;
	
	@ManyToMany(mappedBy = "chatW", cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
	@JsonIgnore
	Set<Women> women;
	
}
