package com.example.demo.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;



//@XmlRootElement inorder to get XML response

@Entity
public class Team {
	
	@Id
	@GeneratedValue
	Long id;
	private String name;
	private String location;
	private String muscot;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="teamId")	
	private Set<Player> players;
	
	public Team() {
	}
	
	public Team(String location, String name, Set<Player> players) {
		this();
		this.location = location;
		this.name = name;
		this.players = players;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMuscot() {
		return muscot;
	}

	public void setMuscot(String muscot) {
		this.muscot = muscot;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Set<Player> getPlayers() {
		return players;
	}

	public void setPlayers(Set<Player> players) {
		this.players = players;
	}
	
	

	
	

}
