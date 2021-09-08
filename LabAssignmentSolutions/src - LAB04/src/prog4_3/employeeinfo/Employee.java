package prog4_3.employeeinfo;

import java.time.LocalDate;

import prog4_3.MyStringList;

@SuppressWarnings("unused")
public class Employee {

	private AccountList accounts;

	private String name;
	private LocalDate hireDate;

	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.name = name;
		hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
		accounts = new AccountList();
	}
	
	public MyStringList getNamesOfAccounts(){
		MyStringList names = new MyStringList();
		for(int i = 0; i < accounts.size(); ++i){
			names.add(accounts.get(i).getAcctType().toString().toLowerCase());
		}
		return names;
	}

	public void createNewChecking(double startAmount) {
		Account checkingAcct = new CheckingAccount(this, startAmount);
		accounts.add(checkingAcct);
	}

	public void createNewSavings(double startAmount) {
		Account savingsAcct = new SavingsAccount(this, startAmount);
		accounts.add(savingsAcct);
	}

	public void createNewRetirement(double startAmount) {
		Account retirementAcct = new RetirementAccount(this, startAmount);
		accounts.add(retirementAcct);
	}

	public String getFormattedAcctInfo() {
		String acctInfo = String.format("\tACCOUNT INFO for %s \n", name);
//		if (checkingAcct != null)
//			acctInfo += checkingAcct.toString();
//		if (savingsAcct != null)
//			acctInfo += savingsAcct.toString();
//		if (retirementAcct != null)
//			acctInfo += retirementAcct.toString();
		for(int i=0; i<accounts.size(); i++)
			acctInfo += accounts.get(i).toString();
		acctInfo += "\n";
		return acctInfo;
	}

	public void deposit(int accountIndex, double amt) {
		Account selected = accounts.get(accountIndex);
		selected.makeDeposit(amt);
	}

	public boolean withdraw(int accountIndex, double amt) {
		return accounts.get(accountIndex).makeWithdrawal(amt);
	}

	public String getName() {
		return name;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

}
