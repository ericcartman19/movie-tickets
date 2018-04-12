package com.valoyes.patterns.movietickets.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valoyes.patterns.movietickets.dao.MovieTicketDAO;
import com.valoyes.patterns.movietickets.bo.MovieTicket;

@Service
public class MovieTicketServiceImpl implements MovieTicketService {

	@Autowired
	private MovieTicketDAO ticketDao;
	
	@Override
	public void purchaseTicket(MovieTicket ticket) {
		
		// process payment
		// toda la logica de negocio debe ir dentro de la business layer
		ticketDao.create(convertTicketBoToEntity(ticket));
		// enviar mail o text message si lo estimamos necesario
	}

	/**
	 * Creamos una entity a partir del bo esto lo podemos hacer tambien en un covertor

	 * @return
	 */
	private com.valoyes.patterns.movietickets.entities.MovieTicket convertTicketBoToEntity(MovieTicket ticket) {
		com.valoyes.patterns.movietickets.entities.MovieTicket ticketEntity = new com.valoyes.patterns.movietickets.entities.MovieTicket();
		ticketEntity.setMovie(ticket.getMovieName());
		ticketEntity.setScreen(ticket.getScreenNo());
		ticketEntity.setSeat(ticket.getSeatNo());
		return ticketEntity;
	}

}
