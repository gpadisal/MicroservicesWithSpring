package com.example.demo;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.example.demo.dao.TeamDao;
import com.example.demo.domain.Player;
import com.example.demo.domain.Team;


@SpringBootApplication
public class MicroserviceBootJpaApplication extends SpringBootServletInitializer{

	/**
	 * Running as jar
	 */	
	
	public static void main(String[] args) {
		SpringApplication.run(MicroserviceBootJpaApplication.class, args);
	}

	/**
	 * Running as war
	 */
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(MicroserviceBootJpaApplication.class);
	}
	
	
	@Autowired TeamDao teamDao;
	
	@PostConstruct
	public void init() {
		Set<Player> players = new HashSet<>();
		players.add(new Player("Gopal", "Batter"));
		players.add(new Player("Raju", "Bowler"));		
		Team team = new Team("Hyderabad","srh", players);
		teamDao.save(team);
	}
}
	
	
	