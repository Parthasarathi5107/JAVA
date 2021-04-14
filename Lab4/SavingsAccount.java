package Lab4;

public class SavingsAccount extends Account {
	
	 public SavingsAccount(long accNum, double balance, Person accHolder) {
		super(accNum, balance, accHolder);
		// TODO Auto-generated constructor stub
	}


	final double MIN_BALANCE=500;
	 
	
	
	//-----------methods-------

	@Override
	public void withdraw(double amount) {
		
		if(super.getBalance()>MIN_BALANCE)
		{ 
			super.withdraw(amount);
			System.out.println("Balance is: "+super.getBalance());
		}
		else
		{
			System.out.println("Cannot withdraw. Low Minimum Balance");
		}
	
	}
	
}

