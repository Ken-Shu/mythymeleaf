package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MessageController {
	@GetMapping("/message")
	public String message(Model model) {
		List<Map> users = new ArrayList<>();
		Map user1 = new LinkedHashMap<>();
		user1.put("name", "Ken");
		user1.put("age", "18");
		Map user2 = new LinkedHashMap<>();
		user2.put("name", "Mary");
		user2.put("age", "19");
		users.add(user1);
		users.add(user2);
		/*
		 * | name | age |
		 * +------+-----+
		 * + John +  18 +
		 * +------+-----+
		 * + Mary +  19 +
		 * +------+-----+
		 */
		
		model.addAttribute("username","John");
		model.addAttribute("nickname","<h1>Baby</h1>");
		model.addAttribute("scores",Arrays.asList(100,40,70));
		model.addAttribute("users" , users);
		return "message";
	}
}
