package prog4_3.employeeinfo;

abstract public class Account {

	private final static double DEFAULT_BALANCE = 0.0;
	protected double balance;
	private Employee emp;

	Account(Employee emp, double balance) {
		this.emp = emp;
		this.balance = balance;
	}

	Account(Employee emp) {
		this(emp, DEFAULT_BALANCE);
	}

	public String toString() {
		return String.format("\n Account type: %s \n Current bal: %4.1f", this.getAcctType(), balance);
	}

	public void makeDeposit(double deposit) {
		balance += deposit;
	}

	public boolean makeWithdrawal(double amount) {
		if(amount>balance) {
			System.out.println("Cannot withdraw: Insufficient funds");
			return false;
		}
		balance -= amount;
		return true;
	}
	

	public double getBalance() {
		return balance;
	}

	public Employee getEmp() {
		return emp;
	}
	
	abstract public AccountType getAcctType();
	
}
