package com.valoyes.patterns.movietickets.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valoyes.patterns.movietickets.dao.MovieTicketDAO;
import com.valoyes.patterns.movietickets.entities.MovieTicket;

@Service
public class MovieTicketServiceImpl implements MovieTicketService {

	@Autowired
	private MovieTicketDAO ticketDao;
	
	@Override
	public void purchaseTicket(MovieTicket ticket) {
		// process payment
		// toda la logica de negocio debe ir dentro de la business layer
		ticketDao.create(ticket);
		// enviar mail o text message si lo estimamos necesario
	}

}
