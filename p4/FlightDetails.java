package p4;
import java.time.format.DateTimeFormatter;

public class FlightDetails {

	public void printFlightDetails(Flight flight)
	{
		/* Write code to print the flight information and fare break up*/
		System.out.println("===========================Flight Details:=================================");
		System.out.println("Airlines = " + flight.getAirliner() );
		System.out.println("From = "+ flight.getSource());
		System.out.println("Departure Date/Time = "+ flight.getFlyDateTime());
		System.out.println("To = "+ flight.getDestination());
		System.out.println("Arrival Date/Time = "+ flight.getArrivalDateTime());
	
			System.out.println("Hault Details :" );
		for(int i=0;i<flight.getHault().length;i++) {
			System.out.println("Airport Name : "+flight.getHault()[i].getAirportName());
			System.out.println("Duration : "+flight.getHault()[i].getDuration());
		}
		if(flight.isFlyType()) 
			System.out.println("Fly Type = International");
		
		else
			System.out.println("Fly Type = Domestic");
		
		System.out.println("\n===========================Fare Breakup====================================");
		System.out.println("Fare = "+(flight.getBaseFare()-(int)(flight.getBaseFare()*0.3)-(int)(flight.getBaseFare()*0.05)));
		System.out.println("Fuel Cost = "+(int)(flight.getBaseFare()*0.3));
		System.out.println("Airport Surcharge = "+(int)(flight.getBaseFare()*0.05));
		System.out.println("Total Base Fare = "+flight.getBaseFare());
		System.out.println("==============================Extra Charges===================================");
		System.out.println("\nLate Booking Charge = "+flight.getLateBookingCharge());
		System.out.println("Landing Time Charge = "+flight.getLandTimeCharge());
		System.out.println("Non Free Counrty Charge = "+flight.getNonFreeCountryCharge());
		System.out.println("International Fly Tax = "+flight.getInternationFlyTax());
		System.out.println("===============================================================================");
		System.out.println("Final Amount Payable = Rs "+flight.getFinalCost());
	}
	
	
}