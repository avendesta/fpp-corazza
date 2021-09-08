package prog4_3;

import java.util.Scanner;

import prog4_3.employeeinfo.Employee;

public class Main {
	Employee[] emps = null;

	public static void main(String[] args) {
		new Main();
	}

	Main() {

		emps = new Employee[3];
		emps[0] = new Employee("Jim Daley", 2000, 9, 4);
		emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
		emps[2] = new Employee("Susan Randolph", 1997, 2, 13);

		emps[0].createNewChecking(10500);
		emps[0].createNewSavings(1000);
		emps[0].createNewRetirement(9300);

		emps[1].createNewChecking(34000);
		emps[1].createNewSavings(27000);

		emps[2].createNewChecking(10038);
		emps[2].createNewSavings(12600);
		emps[2].createNewRetirement(9000);

		Scanner sc = new Scanner(System.in);
		String exit = "n";
		String answer = "";
	
		while (!(answer.equalsIgnoreCase(exit))) {

			displayOptions();
			answer = sc.nextLine();
			switch (answer) {

				case "A":
					getFormattedAccountInfo();
					break;
				case "B":
					executeTransaction(sc, answer);
					break;
				case "C":
					executeTransaction(sc, answer);
					break;
				case "N":
					System.out.println("Program exited !");
					break;
				default:
					System.out.println("I don't understand your input \n");	    
			}	
		}
		sc.close();
	}

	private void executeTransaction(Scanner sc, String type) {

		
		// Show employees list
		displayEmployees();

		// Select employee
		int empIndex = chooseEmployee(sc);

		// choose account to withdraw from
		int accountIndex = chooseAccount(sc, empIndex);

		// Enter amount
		double amount = chooseAmount(sc);

		if (type.equalsIgnoreCase("B")) {

			// Now make a deposit
			emps[empIndex].deposit(accountIndex, amount);

			// Display message
			System.out.println("$" + amount + " has been deposited in the \n "
					+ emps[empIndex].getNamesOfAccounts().get(accountIndex).toLowerCase()+ " account of " + emps[empIndex].getName() + "\n");
		} else {

			// Now make a deposit
			emps[empIndex].withdraw(accountIndex, amount);
			
			// Display message
			System.out.println("$" + amount + " has been withdrawn in the "
					+ emps[empIndex].getNamesOfAccounts().get(accountIndex).toLowerCase() + " account of " + emps[empIndex].getName() + "\n");
		}

	}

	private int chooseEmployee(Scanner sc) {

		System.out.println("Select an employee: (type a number)");
		String empNum = sc.nextLine();
		int empIndex = Integer.parseInt(empNum);

		while (empIndex < 0 || empIndex >= emps.length) {
			System.out.println("Illegal Index , Please select in the range [0," + (emps.length - 1) + "] inclusive");
			empNum = sc.nextLine();
			empIndex = Integer.parseInt(empNum);
		}

		return empIndex;
	}

	private int chooseAccount(Scanner sc, int empId) {

		displayAccountTypes(empId);
		System.out.println("Select an account");
		String acctType = sc.nextLine();
		int accountIndex = Integer.parseInt(acctType);

		while (accountIndex < 0 || accountIndex >= emps[empId].getNamesOfAccounts().size()) {
			System.out.println("Illegal Index , Please select in the range [0,"
					+ (emps[empId].getNamesOfAccounts().size() - 1) + "] inclusive");
			acctType = sc.nextLine();
			accountIndex = Integer.parseInt(acctType);
		}

		return accountIndex;
	}

	private double chooseAmount(Scanner sc) {

		System.out.println("Select an amount");
		String amount = sc.nextLine();
		double amt = Double.parseDouble(amount);

		// if negative number is entered , enter again
		while (amt < 0) {
			System.out.println("You can't enter negative number, please enter positive number");
			amount = sc.nextLine();
			amt = Double.parseDouble(amount);
		}

		return amt;

	}

	private void getFormattedAccountInfo() {

		String info = "";
		for (Employee emp : emps) {

			info += "ACCOUNT INFO FOR " + emp.getName() + ":\n\n" + emp.getFormattedAcctInfo() + "\n\n";
		}
		System.out.println(info);
	}

	private void displayEmployees() {

		String formatedEmployees = "";
		for (int i = 0; i < emps.length; i++) {

			formatedEmployees += i + "." + emps[i].getName() + "\n";
		}

		System.out.println(formatedEmployees);

	}
	private void displayAccountTypes(int empIndex) {

		MyStringList accountTypes = emps[empIndex].getNamesOfAccounts();
		for (int i = 0; i < accountTypes.size(); i++) {
			
			if(accountTypes.get(i) != null)
				System.out.println(i + "." + accountTypes.get(i).toLowerCase());
		}
	}

	private void displayOptions() {
		String n = System.getProperty("line.separator");
		String display = "A. See a report of all accounts." + n + "B. Make a deposit." + n + "C. Make a withdrawal." + n
				+ "N. To exit " + n + "Make a selection(A/B/C)";
		System.out.println(display);
	}
}
