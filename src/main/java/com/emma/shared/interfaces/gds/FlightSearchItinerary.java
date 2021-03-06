package com.emma.shared.interfaces.gds;

import java.time.LocalDateTime;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;

public interface FlightSearchItinerary {

	@ApiModelProperty(required = true, value = "The date and time of departure ",dataType="dateTime")  
	LocalDateTime getDepartureTime();
	@ApiModelProperty(required = true, value = "The date and time of arrival ",dataType="dateTime")  
	LocalDateTime getArrivalTime();

	String getOrigin();

	String getDestination();

	int getNumberOfStops();

	List<FlightSearchLeg> getFlightSearchLegs();

	String getDuration();

}
