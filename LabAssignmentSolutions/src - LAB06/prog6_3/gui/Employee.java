package prog6_3.gui;
import java.time.LocalDate;

public class Employee {

	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private LocalDate hireDate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}

	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.name = name;
		this.hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
		
	}

	public void createNewChecking(double startAmount) {
		this.checkingAcct = new Account(this, AccountType.CHECKING, startAmount);

	}

	public void createNewSavings(double startAmount) {
		this.savingsAcct = new Account(this, AccountType.SAVINGS, startAmount);
	}

	public void createNewRetirement(double startAmount) {
		this.retirementAcct = new Account(this, AccountType.RETIREMENT, startAmount);
	}

	public String getFormattedAcctInfo() {
		
		String formatedAccountInfo = "";
		
		if(this.checkingAcct != null) {
			 formatedAccountInfo = this.checkingAcct.toString() +"\n";
		}
		if(this.savingsAcct !=null) {
			formatedAccountInfo +=this.savingsAcct.toString()+"\n";
		}
		if(this.retirementAcct != null) {
			formatedAccountInfo +=this.retirementAcct.toString();
		}
		
		return formatedAccountInfo;
	}
	
	public void deposit(AccountType acctType, double amt) {

		switch (acctType) {

		case CHECKING:
			this.checkingAcct.makeDeposit(amt);
			break;
		case SAVINGS:
			this.savingsAcct.makeDeposit(amt);
			break;
		case RETIREMENT:
			this.retirementAcct.makeDeposit(amt);
			break;
		default:
			System.out.println("Unrecognizable choice, Please enter correct option");

		}

	}

	public boolean withdraw(AccountType acctType, double amt) {
		
		boolean status = false;
		
		switch (acctType) {

		case CHECKING:
			status = this.checkingAcct.makeWithdrawal(amt);
			break;
		case SAVINGS:
			status = this.savingsAcct.makeWithdrawal(amt);
			break;
		case RETIREMENT:
			status = this.retirementAcct.makeWithdrawal(amt);
			break;
		default:
			System.out.println("Unrecognizable choice, Please enter correct option");
		    
		}

	return status;
	}

}
