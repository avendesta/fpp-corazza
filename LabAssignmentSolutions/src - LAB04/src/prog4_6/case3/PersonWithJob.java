package prog4_6.case3;

final public class PersonWithJob {
	private Person person;
	private double salary;
	PersonWithJob(Person person, double salary) {
		this.person = person;
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(!(ob == this.getClass())) return false;
		PersonWithJob pob = (PersonWithJob)ob;
		return pob.person.equals(this.person) && (pob.getSalary() == this.salary);
	}
}
