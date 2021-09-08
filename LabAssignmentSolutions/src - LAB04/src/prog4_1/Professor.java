package prog4_1;

import java.time.LocalDate;

public class Professor extends DeptEmployee {
	public Professor(String name, double salary, LocalDate hireDate) {
		super(name, salary, hireDate);
		// TODO Auto-generated constructor stub
	}

	private int numberOfPublications;

	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}
	
}
