package prog4_1;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Professor p1 = new Professor("Kyaw", 3400, LocalDate.now());
		Professor p2 = new Professor("Aven", 5500, LocalDate.now().minusDays(2));
		Professor p3 = new Professor("Max", 7600, LocalDate.now());
		Secretary s1 = new Secretary("Tamrat", 3200, LocalDate.now().minusDays(5), 25);
		Secretary s2 = new Secretary("Bulelani", 2310, LocalDate.now(),32);
		
		DeptEmployee[] department = new DeptEmployee[5];
		department[0] = p1;
		department[1] = p2;
		department[2] = p3;
		department[3] = s1;
		department[4] = s2;

		Scanner in = new Scanner(System.in);
		System.out.print("\nDo you want to see the total salary? (Y/n): ");
		String response = in.nextLine();
		in.close();
		if(response.charAt(0) == 'Y' || response.charAt(0) == 'y') {
			double totalSalary = 0;
			for(DeptEmployee d: department)
				totalSalary += d.computeSalary();
			System.out.println(totalSalary);
		}
		System.out.println("Program Exited Sucessfully!");
	}

}
