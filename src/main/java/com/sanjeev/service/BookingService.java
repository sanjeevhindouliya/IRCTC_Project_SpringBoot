package com.sanjeev.service;

import com.sanjeev.request.Passenger;
import com.sanjeev.response.Ticket;

public interface BookingService {
	
	public Ticket bookTicket(Passenger passenger);
	
	public Ticket getTicket(Integer ticketNumber);
	

}
