package Week4;

public class BankAccount {
	
	final String Account_Type="Savings";
	
	int accountNumber;
	
	String accountHolderName;
	
	double balance;
	
	public BankAccount(String Account_Type,int accountNumber,String accountHolderName,double balance) 
	
	{
		this.accountNumber=accountNumber;
		this.accountHolderName=accountHolderName;
		this.balance=balance;
		
		
	}
	
	public void displayAccountDetails()
	{
		
		System.out.println("Account Type:" +Account_Type);
		System.out.println();
		
		System.out.println("Account Details");
		
		System.out.println();
		
		System.out.println("Account Number :" +accountNumber);
		
		System.out.println();
		
		System.out.println("Account Holder Name :" +accountHolderName);
		
		System.out.println();
		
		System.out.println("Balance:" +balance);
	}

	
	public static void main(String[] args) {
		
		BankAccount acc1=new BankAccount("Savings",123456789,"Rohan Sharma",85000.0);
		
		acc1.displayAccountDetails();
		//acc1.Account_Type="Current";
		

	}

}
