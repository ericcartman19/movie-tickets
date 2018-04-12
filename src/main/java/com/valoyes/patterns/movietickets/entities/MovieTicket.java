package com.valoyes.patterns.movietickets.entities;


/**
 * Vamos a utilizar Spring MVC de modo que no necesitamos ninguna 
 * annotation para esa clase, lo cual seria el caso si utilizaramos JPA
 */
public class MovieTicket {
	
	private int id;
	private String movie;
	private String screen;
	private String seat;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMovie() {
		return movie;
	}
	public void setMovie(String movie) {
		this.movie = movie;
	}
	public String getScreen() {
		return screen;
	}
	public void setScreen(String screen) {
		this.screen = screen;
	}
	public String getSeat() {
		return seat;
	}
	public void setSeat(String seat) {
		this.seat = seat;
	}
	
	

}
