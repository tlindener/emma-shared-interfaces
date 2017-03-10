package com.emma.shared.interfaces.gds;

import java.util.List;

import com.emma.shared.interfaces.ResponseStatus;

public interface FlightSearchResult {

	ResponseStatus getResponseStatus();

	String getMessage();

	List<FlightSearchOption> getFlightSearchOptions();

}
