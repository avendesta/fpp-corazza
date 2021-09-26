package prog4_3.employeeinfo;

public class SavingsAccount extends Account {
	private final double INTEREST_RATE = 0.25/100;
	SavingsAccount(Employee emp, double startAmount) {
		super(emp);
		this.balance = startAmount;
	}

	@Override
	public AccountType getAcctType() {
		return AccountType.SAVINGS;
	}
	
	@Override
	public double getBalance() {
		double baseBalance = super.getBalance();
		double interest = INTEREST_RATE*baseBalance;
		return baseBalance + interest;
	}
}
