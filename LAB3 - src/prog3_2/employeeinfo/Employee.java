package prog3_2.employeeinfo;

import java.time.LocalDate;

public class Employee {

	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private LocalDate hireDate;

	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.name = name;
		hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
	}

	public void createNewChecking(double startAmount) {
		checkingAcct = new Account(this, AccountType.CHECKING, startAmount);
	}

	public void createNewSavings(double startAmount) {
		savingsAcct = new Account(this, AccountType.SAVINGS, startAmount);
	}

	public void createNewRetirement(double startAmount) {
		retirementAcct = new Account(this, AccountType.RETIREMENT, startAmount);
	}

	public String getFormattedAcctInfo() {
		String acctInfo = String.format("\tACCOUNT INFO for %s \n", name);
		if (checkingAcct != null)
			acctInfo += checkingAcct.toString();
		if (savingsAcct != null)
			acctInfo += savingsAcct.toString();
		if (retirementAcct != null)
			acctInfo += retirementAcct.toString();

		acctInfo += "\n";
		return acctInfo;
	}

	public void deposit(String acctType, double amt) {
		if (acctType.equals(checkingAcct.toString()))
			checkingAcct.makeDeposit(amt);
		if (acctType.equals(savingsAcct.toString()))
			savingsAcct.makeDeposit(amt);
		if (acctType.equals(retirementAcct.toString()))
			retirementAcct.makeDeposit(amt);
	}

	public boolean withdraw(String acctType, double amt) {
		if (acctType.equals(checkingAcct.toString()))
			if (checkingAcct.getBalance() < amt)
				return false;
			else
				checkingAcct.makeWithdrawal(amt);
		if (acctType.equals(savingsAcct.toString()))
			if (savingsAcct.getBalance() < amt)
				return false;
			else
				savingsAcct.makeWithdrawal(amt);
		if (acctType.equals(retirementAcct.toString()))
			if (retirementAcct.getBalance() < amt)
				return false;
			else
				retirementAcct.makeWithdrawal(amt);

		return true;

	}

	public String getName() {
		return name;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

}
