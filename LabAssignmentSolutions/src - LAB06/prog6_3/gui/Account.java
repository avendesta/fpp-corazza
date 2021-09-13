package prog6_3.gui;

public class Account {
	
	private final static double  DEFAULT_BALANCE = 0.0;
	private AccountType acctType;
	private double balance;
	private Employee employee;
	
	// First constructor
	Account(Employee emp , AccountType acctType , double balance){
		this.employee = emp;
		this.acctType = acctType;
		this.balance = balance;
		
	}
	
	// Second constructor
	Account(Employee emp , AccountType acctType){
		this(emp , acctType, DEFAULT_BALANCE);
	}
	
	public String toString() {
		return "Account type:  " +acctType.toString().toLowerCase()+"\nCurrent bal: "+balance;
	}
	
	// Making deposit
	public void makeDeposit(double val) {
		this.balance += val;
	}
	
	// withdrawal
	public boolean makeWithdrawal(double amount) {
		
		// check if there is enough balance to withdraw
		if(amount > this.balance) 
			return false;
		
		// Update balance
		this.balance -= amount;
		return true;
	}
	
	// getter method for account type
	public AccountType getAcctType() {
		return acctType;
	}
	
	// getter method for balance
	public double getBalance() {
		return this.balance;
	}
	
	// I added this one after confirming from you self.
	
	public void setBalance(double val) {
		
		this.balance = val; 
	}
	
}
