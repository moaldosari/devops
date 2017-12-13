package com.example.devops;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeControler {
	@RequestMapping("/")
	public String welcome(Model model) {
		model.addAttribute("course", "DevOps");
		return "index";
	}

}
