package day4_airlines;

public class FlightDetails {

	public void printFlightDetails(Flight f[]) {
		/* Write code to print the flight information and fare break up */
		
		for(int i=0;i<TravelApp.no_of_flights;i++) {
			
		
		System.out.printf("Flight Number-->" + f[i].getAirliner());
		System.out.printf("\nFlight Name-->" + f[i].getFlightNumber());
		System.out.printf("\nSource-->" + f[i].getSource());
		System.out.printf("\nFlight Fly Date time-->" + f[i].getFlyDateTime());
		System.out.printf("\nDestination-->" + f[i].getDestination());
		System.out.printf("\nArrival date and time-->" + f[i].getArrivalDateTime());
		if (TravelApp.hault_no > 0) {
			System.out.println("\nHaults:-");
		for (Hault ht : f[i].getHault()) {
			System.out.println("\t\tAirport: " + ht.getAirportName());
			System.out.println("\t\tDuration:" + ht.getDuration());
		}}
		System.out.printf("\nTax Rate-->" + f[i].getInternationFlyTax());
		System.out.println("\nBaseFare-->" + f[i].getBaseFare());
		System.out.println("\t****Fare Breakup******\t");
		System.out.println("\tAirport Surcharge--->" + f[i].getAirport_surcharge());
		System.out.println("\tFuel Charge---->" + f[i].getFuel_cost());
		System.out.println("\tHoliday Fee----->"+f[i].getHolidayfee());
		System.out.println("\tHours Fee---->"+f[i].getHoursfee());
		System.out.println("\tNon-Friendly fee---->"+f[i].getNonfriendlytax());
		System.out.println("\t*************************");
		System.out.println("\nFinal Cost-->" + f[i ].getFinalCost());
	}
	}
}
