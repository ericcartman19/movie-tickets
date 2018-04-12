package com.valoyes.patterns.movietickets.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// controller annotation from Spring
@Controller
public class MovieTicketController {

	@RequestMapping("/showCreateTicket")
	public String showCreateTicket() {
		
		return "createTicket";
	}
}
