package prog11_1;

import java.util.HashMap;
import java.util.Iterator;

public class Employee {
	private String firstName;
	private String lastName;
	private HashMap<String, String> salaryRecord = new HashMap<String, String>();
	
	public void addEntry(String date, double salary) {
		salaryRecord.put(date, Double.toString(salary));
	}
	public void printPaymentAmount(String date) {
		if(salaryRecord.containsKey(date))
			System.out.format("%s %s was paid %s on %s\n", firstName, lastName, salaryRecord.get(date), date);
		else
			System.out.format("%s %s did not recieve a paycheck on %s\n", firstName, lastName, date);
	}
	public void printAveragePaycheck() {
		double sum = 0.0;
		for(String s: salaryRecord.values())
			sum += Double.parseDouble(s);
		
		System.out.format("Average paycheck for %s %s was %.2f .\n", firstName, lastName, sum);
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setFirstName("Jim");
		e.setLastName("Jones");
		for(int i = 1; i <= 12; ++i) {
			e.addEntry(i+"/15/2011", 3070+5*i);
		}
		e.printPaymentAmount("3/15/2011");
		e.printPaymentAmount("5/15/2010");
		e.printAveragePaycheck();
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
