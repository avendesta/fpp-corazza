package prog4_3.employeeinfo;

public class RetirementAccount extends Account {
	private final double WITHDRAW_PENALITY = 2.0/100; // A monthly penality for withdrawing from the account
	RetirementAccount(Employee emp, double startAmount) {
		super(emp);
		this.balance = startAmount;
	}

	@Override
	public AccountType getAcctType() {
		return AccountType.RETIREMENT;
	}
	
	@Override
	public boolean makeWithdrawal(double amount) {
		double balance = super.getBalance();
		double newBalance = balance - amount - (WITHDRAW_PENALITY)*balance;
		if(newBalance<0) {
			System.out.println("Cannot withdraw: Insufficient funds!");
			return false;
		}
		balance = newBalance;
		return true;
	}
}
