package com.valoyes.patterns.movietickets.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.valoyes.patterns.movietickets.dao.MovieTicketDAO;
import com.valoyes.patterns.movietickets.bo.MovieTicket;
import com.valoyes.patterns.movietickets.services.MovieTicketService;

// controller annotation from Spring
@Controller
public class MovieTicketController {

	@Autowired
	private MovieTicketDAO dao;
	
	@Autowired
	private MovieTicketService movieTicketService; 
	
	@RequestMapping("/showCreateTicket")
	public String showCreateTicket() {
		
		return "createTicket";
	}
	
	/**
	 * Spring de manera automatica, va a tomar la informacion que sale de nuestro form
	 * y con ella creare una instancia de MovieTicket.
	 * 
	 * Este metodo persiste el ticket en la base de datos y reenvia al usuario a la pagina
	 * createTicket.jsp
	 * 
	 * El nombre de esta clase coincide con <form action="createTicket"
	 * 
	 * @param ticket
	 * @return
	 */
	@RequestMapping("/createTicket")
	public String createTicket(MovieTicket ticket, ModelMap modelMap) {
		
		// dao.create(ticket);
		// el controlador (presentation layer) no debe acceder directamente a la data acces layer (dao)
		movieTicketService.purchaseTicket(ticket); 
		modelMap.addAttribute("msg", "Se ha realizado con exito la compra del ticket");
		// seguumos volviendo a la pagina de entrada
		return "createTicket";
	}
}
