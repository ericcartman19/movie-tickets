package com.valoyes.patterns.movietickets.bo;



/**
 * Esto es un Business Object, una copia exacta de la entity cuyos fields tienen distinto nombre
 * lo cual permite a loosely coupled implementation 
 * 
 * Business Object : se usa normalmente entre el business delegate (service layer) y el dao; 
 * pero tambi'en entre la presentation layer, business delegate y el dao. 
 * El business object es una replica de la entity pero la diferencia es que puede tener nombres distintos que la entity. 
 * Esto permitiría no tener que cambiar el presentation layer (tocar el jsp por ejemplo), 
 * cada vez que modificamos nuestras entity a causa de la base de datos. 
 * 
 * Usando business objects pasamos de un tightly a un loosy-coupled model.
 *
 */
public class MovieTicket {
	
	private int id;
	private String movieName;
	private String screenNo;
	private String seatNo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getScreenNo() {
		return screenNo;
	}
	public void setScreenNo(String screenNo) {
		this.screenNo = screenNo;
	}
	public String getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}

}
