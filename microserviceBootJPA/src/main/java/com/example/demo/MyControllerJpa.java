package com.example.demo;


import java.util.Map;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.TeamDao;
import com.example.demo.domain.Player;
import com.example.demo.domain.Team;

//@Controller
@RestController
public class MyControllerJpa {
	
	@Autowired TeamDao teamDao;
	
	@RequestMapping("/teams/{name}")
	//public @ResponseBody Team getHello() {
	public Team getHello(@PathVariable String name) {
		Team team = teamDao.findByName(name);
		return team;
	}
	
	


}
