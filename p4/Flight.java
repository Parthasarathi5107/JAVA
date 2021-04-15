package p4;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.Duration;

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
	
	private int baseFare = 15000; // always include 5% as airport surcharge and 30% as fuel cost
	private int finalCost;// based on Airliner calendar and other criteria's 
	
	public AirlinerCalendar a = new AirlinerCalendar(); 
	public FriendlyCountry f = new FriendlyCountry();
	
	int lateBookingCharge;
	int landTimeCharge;
	int nonFreeCountryCharge;
	
	
	public Flight() {
		
	}
	
	


	public int calculateCost()
	{
		/*
		 * Cost of the flight will be decided by 
		 * 1. arrival date. :-
		 * 		1.a)  If 10 to 2 days prior to the AirlinerCalendar Date	 :- 20% extra
		 * 		1.b)  If 1 to 0 day prior to the AirlinerCalendar Date 	:-  50% extra	
		 * 2. arrival time.
		 * 		2.a) If flight land time is 2 hr +/- to 12:00 Noon (Any Date)	:- 10% extra
		 * 3. Non free travel countries (List of FriendlyCountry.java)
		 * 		3.a) If destination belongs to non free travel, friendly country :- 30% extra
		 * */
		for(int i=0;i<a.listOfHolidays.length;i++) {
			int daysPrior = arrivalDateTime.getDayOfMonth()-a.listOfHolidays[i].getDayOfMonth();
			if(daysPrior>=2 && daysPrior<=10 ) {
				lateBookingCharge =(int)( (0.2*baseFare));
				
			}
			else if(daysPrior>=1 && daysPrior<=0 ) {
				lateBookingCharge = (int)(0.5*baseFare);
				
			}
		}
		
		int hour=arrivalDateTime.getHour();
		if(hour<=14 && hour>=10) {
			landTimeCharge = (int) (baseFare*0.1);
			
		}
		
		
		if(flyType) {
		int flag = 0;
		for(int i=0;i<f.countries.length;i++) {
			if(destination == f.countries[i]) {
				flag = 1;
				break;
			}
		}
		if(flag==0) {
			nonFreeCountryCharge =  (int)(baseFare*0.3);
			
		}
		
		
		
			internationFlyTax = 4000;
		
		}
		finalCost = baseFare + landTimeCharge + lateBookingCharge + internationFlyTax + nonFreeCountryCharge;
		return finalCost;
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

	public int getLateBookingCharge() {
		return lateBookingCharge;
	}

	public void setLateBookingCharge(int lateBookingCharge) {
		this.lateBookingCharge = lateBookingCharge;
	}
	public int getLandTimeCharge() {
		return landTimeCharge;
	}

	public void setLandTimeCharge(int landTimeCharge) {
		this.landTimeCharge = landTimeCharge;
	}

	public int getNonFreeCountryCharge() {
		return nonFreeCountryCharge;
	}

	public void setNonFreeCountryCharge(int nonFreeCountryCharge) {
		this.nonFreeCountryCharge = nonFreeCountryCharge;
	}
	
	
}