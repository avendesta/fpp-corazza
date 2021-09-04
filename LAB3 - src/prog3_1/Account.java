package prog3_1;

public class Account {
//	public final static String CHECKING = "checking";
//	public final static String SAVINGS = "savings";
//	public final static String RETIREMENT = "retirement";
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private AccountType acctType;
	private Employee emp;

	Account(Employee emp, AccountType acctType, double balance) {
		this.emp = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	Account(Employee emp, AccountType acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	public String toString() {
		return "type = " + acctType + ", balance = " + balance;
	}

	public void makeDeposit(double deposit) {
		balance += deposit;
	}

	public boolean makeWithdrawal(double amount) {
		if(amount>balance)
			return false;
		balance -= amount;
		return true;
	}
	
	public AccountType getAcctType() {
		return acctType;
	}
	
	public double getBalance() {
		return balance;
	}

	public Employee getEmp() {
		return emp;
	}
	
	

}
