package com.example.demo;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyControllerThymeLeaf {
	
	@RequestMapping("/hi/{name}")
	public String getHello(Map model, @PathVariable String name) {
		model.put("name", name);
		return "hello";
	}

}
