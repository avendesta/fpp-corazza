package prog4_3;

import java.util.Scanner;

import prog4_3.employeeinfo.Employee;
@SuppressWarnings("unused")
public class MainDebug {
	Employee[] emps = null;
	public static void main(String[] args) {
		new MainDebug();
	}

	MainDebug(){
		emps = new Employee[3];
		emps[0] = new Employee("Jim Daley", 2000, 9, 4);
		emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
		emps[2] = new Employee("Susan Randolph", 1997, 2,13);
		
		emps[0].createNewChecking(10500);
		emps[0].createNewSavings(1000);
		emps[0].createNewRetirement(9300);
		emps[1].createNewChecking(34000);
		emps[1].createNewSavings(27000);
//		emps[1].createNewRetirement(0);
		emps[2].createNewChecking(10038);
		emps[2].createNewSavings(12600);
		emps[2].createNewRetirement(9000);	
		
		//
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("A. See a report of all accounts ");
		System.out.println("B. Make a deposite");
		System.out.println("C. Make a withdraw");
		System.out.print("\tMake a selection (A/B/C): ");
		
		String answer = sc.next();
		
		switch(answer) {
			case "A":
			case "a":
				String info = getFormattedAccountInfo();
				System.out.println(info);
				break;
			case "B":
			case "b":
				// display employees with their index and
				//ask the user to select an employee
				/*
				 * NOT IMPLEMENTED FULLY
				 */
				for(int i =0; i<emps.length; i++)
					System.out.println(i+".  "+ emps[i].getName());
				System.out.print("\tSelect an employee: ");
				int accountIndex = sc.nextInt();
				break;
			case "C":
			case "c":
				// display employees with their index and
				// ask the user to select an employee 
				/*
				 * NOT IMPLEMENTED YET
				 */
				break;
			default:
				/*
				 * NOT IMPLEMENTED YET
				 */
				// application exists
				
		}
		
		sc.close();

	}
	String getFormattedAccountInfo(){
		String totalInfo = "";
		for(Employee emp : emps)
			totalInfo += emp.getFormattedAcctInfo();
		return totalInfo;
	}
}
