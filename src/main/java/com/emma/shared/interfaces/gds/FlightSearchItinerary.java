package com.emma.shared.interfaces.gds;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public interface FlightSearchItinerary {

	LocalDateTime getDepartureTime();

	LocalDateTime getArrivalTime();

	String getOrigin();

	String getDestination();

	int getNumberOfStops();

	List<FlightSearchLeg> getFlightSearchLegs();

	String getDuration();

}
