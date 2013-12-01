package me.zeph.spring.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class WelcomeController {

	public static final String INDEX = "index";

	@RequestMapping(value = "/", method = GET)
	public String welcome(Model model, Principal principal) {
		String name = principal.getName();
		model.addAttribute("username", name);
		return INDEX;
	}

	@RequestMapping(value = "index", method = GET)
	public String welcomeView(Model model, Principal principal) {
		String name = principal.getName();
		model.addAttribute("username", name);
		return INDEX;
	}
}
