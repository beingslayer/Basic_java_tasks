package day4_airlines;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Flight {

	private String flightNumber;
	private String airliner;

	private String source;
	private LocalDateTime flyDateTime;

	private String destination;
	private LocalDateTime arrivalDateTime;

	private Hault[] hault; // can be null;

	private boolean flyType; // domestic (false) or international(true)
	private int internationFlyTax;

	private int baseFare; // always include 5% as airport surcharge and 30% as fuel cost
	private int finalCost;// based on Airliner calendar and other criteria's
	private int airport_surcharge, fuel_cost, hoursfee = 0, holidayfee = 0, nonfriendlytax = 0;

	public int calculateCost() {
		/*
		 * Cost of the flight will be decided by 1. arrival date. :- 1.a) If 10 to 2
		 * days prior to the AirlinerCalendar Date :- 20% extra 1.b) If 1 to 0 day prior
		 * to the AirlinerCalendar Date :- 50% extra 2. arrival time. 2.a) If flight
		 * land time is 2 hr +/- to 12:00 Noon (Any Date) :- 10% extra 3. Non free
		 * travel countries (List of FriendlyCountry.java) 3.a) If destination belongs
		 * to non free travel, friendly country :- 30% extra
		 */
		AirlinerCalendar a = new AirlinerCalendar();
		FriendlyCountry friendlycountry = new FriendlyCountry();
		for (int i = 0; i < a.listOfHolidays.length; i++) {
			int daysPrior = arrivalDateTime.getDayOfMonth() - a.listOfHolidays[i].getDayOfMonth();
			if (daysPrior >= 2 && daysPrior <= 10) {
				holidayfee = (int) ((0.2 * baseFare));

			} else if (daysPrior >= 1 && daysPrior <= 0) {
				holidayfee = (int) (0.5 * baseFare);

			}
		}

		int hour = arrivalDateTime.getHour();
		if (hour <= 14 && hour >= 10) {
			hoursfee = (int) (baseFare * 0.1);

		}

		if (flyType = true) {
			for (int i = 0; i < friendlycountry.countries.length; i++) {
				if (destination != friendlycountry.countries[i]) {
					nonfriendlytax = (int) (0.3 * baseFare);
				}
			}
		}

		System.out.println(holidayfee + "\t" + hoursfee + "\t" + nonfriendlytax);
		finalCost = (int) (baseFare + holidayfee + hoursfee + nonfriendlytax);
		airport_surcharge = (int) (baseFare * 0.05);
		fuel_cost = (int) (baseFare * 0.3);
		return finalCost;

	}

	public int getHoursfee() {
		return hoursfee;
	}

	public void setHoursfee(int hoursfee) {
		this.hoursfee = hoursfee;
	}

	public int getHolidayfee() {
		return holidayfee;
	}

	public void setHolidayfee(int holidayfee) {
		this.holidayfee = holidayfee;
	}

	public int getNonfriendlytax() {
		return nonfriendlytax;
	}

	public void setNonfriendlytax(int nonfriendlytax) {
		this.nonfriendlytax = nonfriendlytax;
	}

	public int getAirport_surcharge() {
		return airport_surcharge;
	}

	public void setAirport_surcharge(int airport_surcharge) {
		this.airport_surcharge = airport_surcharge;
	}

	public int getFuel_cost() {
		return fuel_cost;
	}

	public void setFuel_cost(int fuel_cost) {
		this.fuel_cost = fuel_cost;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getAirliner() {
		return airliner;
	}

	public void setAirliner(String airliner) {
		this.airliner = airliner;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public LocalDateTime getFlyDateTime() {
		return flyDateTime;
	}

	public void setFlyDateTime(LocalDateTime flyDateTime) {
		this.flyDateTime = flyDateTime;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public LocalDateTime getArrivalDateTime() {
		return arrivalDateTime;
	}

	public void setArrivalDateTime(LocalDateTime arrivalDateTime) {
		this.arrivalDateTime = arrivalDateTime;
	}

	public Hault[] getHault() {
		return hault;
	}

	public void setHault(Hault[] hault) {
		this.hault = hault;
	}

	public boolean isFlyType() {
		return flyType;
	}

	public void setFlyType(boolean flyType) {
		this.flyType = flyType;
	}

	public int getInternationFlyTax() {
		return internationFlyTax;
	}

	public void setInternationFlyTax(int internationFlyTax) {
		this.internationFlyTax = internationFlyTax;
	}

	public int getBaseFare() {
		return baseFare;
	}

	public void setBaseFare(int baseFare) {
		this.baseFare = baseFare;
	}

	public int getFinalCost() {
		return finalCost;
	}

	public void setFinalCost(int finalCost) {
		this.finalCost = finalCost;
	}

}
