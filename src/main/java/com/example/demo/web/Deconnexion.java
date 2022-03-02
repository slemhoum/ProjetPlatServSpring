package com.example.demo.web;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entities.ChefService;

@Controller

@RequestMapping("/deconnexion")
public class Deconnexion {
	@GetMapping
	public String dec(Model model,HttpSession session) {
		session.removeAttribute("chef");
		
		
		return "redirect:/login";
		
	}

}
