package com.emma.shared.interfaces.gds;

import java.util.List;

public interface FlightSearchOption {

	String getCurrency();

	List<FlightSearchItinerary> getFlightSearchItineraries();

	String getProviderId();

	String getTotalPrice();

}
