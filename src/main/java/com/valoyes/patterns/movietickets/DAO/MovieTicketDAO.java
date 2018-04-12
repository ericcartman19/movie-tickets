package com.valoyes.patterns.movietickets.DAO;

import com.valoyes.patterns.movietickets.entities.MovieTicket;

/**
 * Implementando DAO pattern: todas las CRUD operations
 * concerning movie_ticket son definidas por esta interface
 *
 */
public interface MovieTicketDAO {

	void create(MovieTicket ticket);
}
