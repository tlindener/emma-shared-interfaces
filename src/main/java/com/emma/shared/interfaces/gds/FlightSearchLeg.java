package com.emma.shared.interfaces.gds;

import java.time.LocalDateTime;

import io.swagger.annotations.ApiModelProperty;

public interface FlightSearchLeg {

	String getMarketingAirline();

	String getOperatingAirline();

	String getOrigin();

	String getDestinationTerminal();

	String getOriginTerminal();

	String getDestination();

	@ApiModelProperty(required = true, value = "The date and time of departure ",dataType="date-time")  
	LocalDateTime getDepartureTime();
	@ApiModelProperty(required = true, value = "The date and time of arrival ",dataType="date-time")  
	LocalDateTime getArrivalTime();

	int getDuration();

	String getMeal();

	int getMiles();

	String getAircraft();

	String getBookingCode();

	String getFlightNumber();

}
