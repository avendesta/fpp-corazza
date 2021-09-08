package prog4_3.employeeinfo;

public class CheckingAccount extends Account {
	double SERVICE_CHARGE = 5; // Monthly service charge for asking balance with getBalance
	CheckingAccount(Employee emp, double startAmount) {
		super(emp);
		this.balance = startAmount;
	}
	
	@Override
	public AccountType getAcctType() {
		return AccountType.CHECKING;
	}

	@Override
	public double getBalance() {
		double baseBalance = super.getBalance();
		return (baseBalance - SERVICE_CHARGE);
	}

}
