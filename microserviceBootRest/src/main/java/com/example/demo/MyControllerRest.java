package com.example.demo;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Player;
import com.example.demo.domain.Team;

//@Controller
@RestController
public class MyControllerRest {
	
	private Team team;
	
	@PostConstruct
	public void init() {
		Set<Player> players = new HashSet<>();
		players.add(new Player("Gopal", "Batter"));
		players.add(new Player("Raju", "Bowler"));		
		team = new Team("India","SRH", players);
	}
	
	@RequestMapping("/teams")
	//public @ResponseBody Team getHello() {
	public Team getHello() {
		return team;
	}
	
	


}
