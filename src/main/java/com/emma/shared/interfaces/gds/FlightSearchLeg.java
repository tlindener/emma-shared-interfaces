package com.emma.shared.interfaces.gds;

import java.time.LocalDateTime;

public interface FlightSearchLeg {

	String getMarketingAirline();

	String getOperatingAirline();

	String getOrigin();

	String getDestinationTerminal();

	String getOriginTerminal();

	String getDestination();

	LocalDateTime getDepartureTime();

	LocalDateTime getArrivalTime();

	int getDuration();

	String getMeal();

	int getMiles();

	String getAircraft();

	String getBookingCode();

	String getFlightNumber();

}
