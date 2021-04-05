package p4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TravelApp {

	public static void main(String[] args) {
		/* Write code to call Flight constructor and Flight class setter methods*/
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		Flight flight = new Flight("10001","Emirates","BLR",LocalDateTime.parse("2021-05-04 12:30", format),"LHR",LocalDateTime.parse("2021-05-06 16:30", format),false,10000);
		System.out.println("Enter number of Halts:");
		Scanner sc = new Scanner(System.in);
		int haltCount = sc.nextInt();
		sc.nextLine();
		Halt[] halt = new Halt[haltCount];
		for(int i = 0; i < haltCount; i++) {
			Halt h = new Halt();
			System.out.println("Enter Airport Name");
			h.setAirportName(sc.nextLine());
			System.out.println("Enter duration (In Minutes)");
			h.setDuration(sc.nextInt());
			sc.nextLine();
			halt[i] = h;
		}
		sc.close();
		flight.setHalt(halt);
		flight.calculateCost();
		
		FlightDetails flightDetails = new FlightDetails();
		flightDetails.printFlightDetails(flight);
		
	}

}