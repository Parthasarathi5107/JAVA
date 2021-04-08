package Day3;

public class BankApp {

public static void main(String[] args) {
		
		
		/* business use case
		 * -------------------
		 * if balance is less than 10,000 :- account holder cannot withdrawal 
		 * in such case account status should be inactive.
		 *  
		 * */
		BankAccount obj = new BankAccount("ABC", 20000);
		
		System.out.println(obj.doWithdrawal(10000)+" "+obj.isStatus());
		
		System.out.println("Balnce after deposit is:" +obj.doDeposit(20000));
	}
}
