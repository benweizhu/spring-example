package me.zeph.spring.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class ManageController {

	public static final String MANAGE = "manage";
	public static final String ALERT_ERROR_JSP = "alert-error.jsp";

	@RequestMapping(value = "manage", method = GET)
	public String view() {
		return MANAGE;
	}

	@RequestMapping(value = "manage", method = POST)
	public String changePassword(Model model) {
		model.addAttribute("result", ALERT_ERROR_JSP);
		return MANAGE;
	}
}
