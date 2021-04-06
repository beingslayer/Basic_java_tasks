package day4_airlines;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TravelApp {
	static String flydate, flytime, arrivedate, arrivetime;
	static LocalDateTime flying_date, arriving_date;
	static String flight_no, flight_name, flight_source, destination;
	static String hault_name;
	static int no_of_flights,basefare, hr, hault_no, hourofhault;
	public static void main(String[] args) {
		/* Write code to call Flight constructor and Flight class setter methods */
		boolean flag = false;
		int tax = 0;
		Flight flight = new Flight();
		Scanner sc = new Scanner(System.in);
		System.out.println("How many flights");
		 no_of_flights = sc.nextInt();
		sc.nextLine();
		Flight[] f = new Flight[no_of_flights];
		for (int i = 0; i < no_of_flights; i++) {
			f[i] = new Flight();
			System.out.println("Enter the following flight details");
			System.out.printf("Flight Number-->");
			flight_no = sc.nextLine();
			f[i].setFlightNumber(flight_no);
			System.out.printf("Flight Name-->");
			flight_name = sc.nextLine();
			f[i].setAirliner(flight_name);
			System.out.printf("Source-->");
			flight_source = sc.nextLine();
			f[i].setSource(flight_source);
			System.out.printf("Flight Fly Day,month and year(YYYY-mm-DD)");
			flydate = sc.nextLine();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate fdate = LocalDate.parse(flydate, formatter);
			System.out.printf("Flight Fly hour and minute(HH::MM)");
			flytime = sc.nextLine();
			LocalTime time = LocalTime.parse(flytime);
			flying_date = dateFormat(fdate, time);
			f[i].setFlyDateTime(flying_date);

			System.out.printf("Destination-->");
			destination = sc.nextLine();
			f[i].setDestination(destination);

			System.out.printf("Flight arrival Day,month and year(YYYY-mm-DD)");
			arrivedate = sc.nextLine();
			LocalDate adate = LocalDate.parse(arrivedate, formatter);

			System.out.printf("Flight arrival hour and minute(HH::MM)");
			arrivetime = sc.nextLine();
			LocalTime atime = LocalTime.parse(arrivetime);

			arriving_date = dateFormat(adate, atime);
			f[i].setArrivalDateTime(arriving_date);

			System.out.println("How many haults");
			hault_no = sc.nextInt();

			sc.nextLine();
			if (hault_no > 0) {
				Hault[] ht = new Hault[hault_no];
				for (int j = 0; j < hault_no; j++) {
					ht[j] = new Hault();
					System.out.println("Hault Airport name");
					hault_name = sc.nextLine();
					ht[j].setAirportName(hault_name);
					System.out.println("Duration in hr");
					hourofhault = sc.nextInt();
					ht[j].setDuration(hourofhault);
					sc.nextLine();
				}
				flight.setHault(ht);
			}

			System.out.printf("Flight Type:  1.International \t 2.Domestic");
			System.out.print("Your choice (1 or 2):-");
			int flight_type = sc.nextInt();
			f[i].setFlyType(flag);

			if (flight_type == 1) {
				flag = true;
				System.out.printf("Tax Rate-->");
				tax = sc.nextInt();
				f[i].setInternationFlyTax(tax);

			} else if (flight_type == 2) {
				flag = false;
				tax = 0;
			} else {
				System.out.println("ERROR");
			}
			System.out.printf("Base Fare-->");
			basefare = sc.nextInt();
			f[i].setBaseFare(basefare);
			f[i].calculateCost();
			sc.nextLine();
		}
		FlightDetails flightDetails = new FlightDetails();
		flightDetails.printFlightDetails(f);

	}

	private static LocalDateTime dateFormat(LocalDate date, LocalTime time) {
		LocalDateTime dt = LocalDateTime.of(date, time);
		return dt;
	}

}
