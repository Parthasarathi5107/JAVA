package p4;

import java.util.Scanner;
import java.time.LocalDateTime;

public class TravelApp {
	
	public static void main(String[] args) {
		Flight flight = new Flight();
		System.out.println("=================================Please fill in the details : ===================================");
		
		System.out.print("Name of airline : ");
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		flight.setAirliner(inputString);
		
		System.out.print("Flight no : ");
		inputString = sc.nextLine();
		flight.setFlightNumber(inputString);
		
		System.out.print("Traveling From : ");
		String str = sc.nextLine();
		flight.setSource(str);
		
		System.out.println("Departure Date and time : ");
		System.out.println("Enter date in (yyyy-mm-dd) format : " );
		inputString = sc.nextLine();
		System.out.println("Enter time in 24 hour (hh:mm:ss) format : " );
		String FinalDateTime = sc.nextLine();
		FinalDateTime = inputString+"T"+FinalDateTime;
		flight.setFlyDateTime(LocalDateTime.parse(FinalDateTime));
		
		System.out.print("Traveling To : ");
		inputString = sc.nextLine();
		flight.setDestination(inputString);
		
		System.out.println("Arrival Date and time : ");
		System.out.println("Enter date in (yyyy-mm-dd) format : " );
		inputString = sc.nextLine();
		System.out.println("Enter time in 24 hour (hh:mm:ss) format : " );
		FinalDateTime = sc.nextLine();
		FinalDateTime = inputString+"T"+FinalDateTime;
		flight.setArrivalDateTime(LocalDateTime.parse(FinalDateTime));
		
		System.out.print("\nHow many haults?:");
		int inputInt = sc.nextInt();
		sc.nextLine();
	
		
		
		Hault h[] = new Hault[inputInt];
		for(int i=0;i<inputInt;i++) {
			Hault temp = new Hault();
			System.out.println("Enter "+ (i+1)+" Hault Information: ");
			System.out.print("Airport Name :");
			inputString = sc.nextLine();
			temp.setAirportName(inputString);
			
			System.out.print("Duration(in hours) :");
			inputInt = sc.nextInt();
			temp.setDuration(inputInt);
			sc.nextLine();
			
			h[i]=temp;
		}
		flight.setHault(h);
		
		System.out.println("Fly type : " );
		inputString = sc.nextLine();
		if(inputString.equals("International")) {
			flight.setFlyType(true);}
		else if(inputString.equals("Domestic")) {
			flight.setFlyType(false);}
		else {
			System.out.println("Error");
		}
		
		
		
		
		
		
		
		flight.calculateCost();
		
		
		
		FlightDetails flightDetails = new FlightDetails();
		flightDetails.printFlightDetails(flight);
		
	}

}