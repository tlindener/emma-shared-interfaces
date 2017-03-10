package com.emma.shared.interfaces.gds;

import java.time.LocalDate;
import java.time.LocalTime;

public interface FlightSearchRequest {

	public LocalTime getArriveBy();

	public void setArriveBy(LocalTime arriveBy);

	public LocalTime getDepartBy();

	public void setDepartBy(LocalTime departBy);

	public void setNonStop(boolean nonStop);

	public String getOrigin();

	public void setOrigin(String origin);

	public String getDestination();

	public void setDestination(String destination);

	public LocalDate getDepartureDate();

	public void setDepartureDate(LocalDate departureDate);

	public LocalDate getReturnDate();

	public void setReturnDate(LocalDate returnDate);

	public double getMaxPrice();

	public void setMaxPrice(double maxPrice);

	public int getPassengersAdults();

	public void setPassengersAdults(int passengersAdults);

	public int getPassengersChildren();

	public void setPassengersChildren(int passengersChildren);

	public int getPassengersInfants();

	public void setPassengersInfants(int passengersInfants);

	public boolean isNonStop();

	public String getFlightClass();
}
