package  day4_airlines;



public class FlightDetails {

	public void printFlightDetails(Flight f)
	{
		/* Write code to print the flight information and fare break up*/
		
		System.out.printf("Flight Number-->"+f.getAirliner());
		
		System.out.printf("\nFlight Name-->"+f.getFlightNumber());
		
		System.out.printf("\nSource-->"+f.getSource());
		
		System.out.printf("\nFlight Fly Date time-->"+f.getFlyDateTime());
		
		
		System.out.printf("\nDestination-->"+f.getDestination());
		
		System.out.printf("\nArrival date and time-->"+f.getArrivalDateTime());
		if(TravelApp.hault_no>0)
		System.out.println("\nHaults:-");
		
		for(Hault ht:f.getHault()) {
			System.out.println("\t\tAirport: "+ht.getAirportName());
			System.out.println("\t\tDuration:"+ht.getDuration());
		}
		System.out.printf("\nTax Rate-->"+f.getInternationFlyTax());
		System.out.println("\nBaseFare-->"+f.getBaseFare());
		System.out.println("\t****Fare Breakup******\t");
		System.out.println("\tAirport Surcharge--->"+f.getAirport_surcharge());
		System.out.println("\tFuel Charge---->"+f.getFuel_cost());
		System.out.println("\t********");
		System.out.println("\nFinal Cost-->"+f.getFinalCost());
			
	}
}
