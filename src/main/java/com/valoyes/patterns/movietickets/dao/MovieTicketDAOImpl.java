package com.valoyes.patterns.movietickets.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.valoyes.patterns.movietickets.entities.MovieTicket;

@Repository
public class MovieTicketDAOImpl implements MovieTicketDAO {

	private static final String SQL_INSERT = "insert into ticket (movie, screen, seat) values (?, ?, ?)";
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void create(MovieTicket ticket) {

		jdbcTemplate.update(SQL_INSERT, ticket.getMovie(), ticket.getScreen(), ticket.getSeat());
	}

}
