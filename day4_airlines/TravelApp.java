package day4_airlines;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TravelApp {
	static String flydate, flytime, arrivedate, arrivetime;
	static int basefare, hr, hault_no, hourofhault;
	static LocalDateTime flying_date, arriving_date;
	static String flight_no, flight_name, flight_source, destination;
	static String hault_name;

	public static void main(String[] args) {
		/* Write code to call Flight constructor and Flight class setter methods */
		boolean flag = false;
		int tax = 0;
		Flight flight = new Flight();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the following flight details");
		System.out.printf("Flight Number-->");
		flight_no = sc.nextLine();
		System.out.printf("Flight Name-->");
		flight_name = sc.nextLine();
		System.out.printf("Source-->");
		flight_source = sc.nextLine();
		System.out.printf("Flight Fly Day,month and year(YYYY-mm-DD)");
		flydate = sc.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate fdate = LocalDate.parse(flydate, formatter);
		System.out.printf("Flight Fly hour and minute(HH::MM)");
		flytime = sc.nextLine();
		LocalTime time = LocalTime.parse(flytime);
		flying_date = dateFormat(fdate, time);
		System.out.printf("Destination-->");
		destination = sc.nextLine();
		System.out.printf("Flight arrival Day,month and year(YYYY-mm-DD)");
		arrivedate = sc.nextLine();
		LocalDate adate = LocalDate.parse(arrivedate, formatter);
		System.out.printf("Flight arrival hour and minute(HH::MM)");
		arrivetime = sc.nextLine();
		LocalTime atime = LocalTime.parse(arrivetime);
		arriving_date = dateFormat(adate, atime);
		System.out.println("How many haults");
		hault_no = sc.nextInt();
		sc.nextLine();
		if (hault_no > 0) {
			Hault[] ht = new Hault[hault_no];
			for (int i = 0; i < hault_no; i++) {
				Hault temp = new Hault();
				System.out.println("Hault Airport name");
				hault_name = sc.nextLine();
				temp.setAirportName(hault_name);
				System.out.println("Duration in hr");
				hourofhault = sc.nextInt();
				temp.setDuration(hourofhault);
				sc.nextLine();
				ht[i] = temp;
			}
			flight.setHault(ht);
		}

		System.out.printf("Flight Type:  1.International \t 2.Domestic");
		System.out.print("Your choice (1 or 2):-");
		int flight_type = sc.nextInt();
		if (flight_type == 1) {
			flag = true;
			System.out.printf("Tax Rate-->");
			tax = sc.nextInt();
		} else if (flight_type == 2) {
			flag = false;
			tax = 0;
		} else {
			System.out.println("ERROR");
		}
		System.out.printf("Base Fare-->");
		basefare = sc.nextInt();

		flight.setAirliner(flight_name);
		flight.setFlightNumber(flight_no);
		flight.setSource(flight_source);
		flight.setFlyDateTime(flying_date);
		flight.setDestination(destination);
		flight.setArrivalDateTime(arriving_date);
		flight.setFlyType(flag);
		flight.setInternationFlyTax(tax);
		flight.setBaseFare(basefare);
		flight.calculateCost();

		FlightDetails flightDetails = new FlightDetails();
		flightDetails.printFlightDetails(flight);

	}

	private static LocalDateTime dateFormat(LocalDate date, LocalTime time) {
		LocalDateTime dt = LocalDateTime.of(date, time);
		return dt;
	}

}
