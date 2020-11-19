package com.example.demo.domain;

import java.util.Set;

public class Team {
	
	private String name;
	private String muscot;
	
	private Set<Player> players;

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

	public Set<Player> getPlayers() {
		return players;
	}

	public void setPlayers(Set<Player> players) {
		this.players = players;
	}
	

}
