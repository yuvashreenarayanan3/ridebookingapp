package com.app.ridebookingapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(name = "ride")
public class BookRide {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long BookingId;
	
	@NonNull
	private String source;
	
	@NonNull
	private String destination;
	
	public BookRide() {}
	
	public BookRide(long bookingId, String source, String destination) {
		super();
		BookingId = bookingId;
		this.source = source;
		this.destination = destination;
	}
	
	public long getBookingId() {
		return BookingId;
	}
	
	public void setBookingId(long bookingId) {
		BookingId = bookingId;
	}
	
	public String getSource() {
		return source;
	}
	
	public void setSource(String source) {
		this.source = source;
	}
	
	public String getDestination() {
		return destination;
	}
	
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	
	
	
	

}
