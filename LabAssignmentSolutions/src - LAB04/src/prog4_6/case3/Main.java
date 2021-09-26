package prog4_6.case3;

import java.util.GregorianCalendar;
@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) {
		Person p1 = new Person("Esam", new GregorianCalendar(2018, 6, 27, 16, 16, 47));
		Person p2 = new Person("Esam", new GregorianCalendar(2018, 6, 27, 16, 16, 47));
		Person p3 = new Person("Esam", new GregorianCalendar(2020, 3, 12, 15, 1, 22));
		Person p4 = new Person("Sam", new GregorianCalendar(2018, 6, 27, 16, 16, 47));
		Person p5 = new Person("Sam", new GregorianCalendar(2018, 6, 27, 16, 16, 47));
		
		PersonWithJob pwj1 = new PersonWithJob(p1, 2400);
		PersonWithJob pwj2 = new PersonWithJob(p2, 5680);
		PersonWithJob pwj3 = new PersonWithJob(p3, 2700);
		PersonWithJob pwj4 = new PersonWithJob(p4, 2400);
		PersonWithJob pwj5 = new PersonWithJob(p5, 2400);
		System.out.println(pwj5.equals(pwj4));
	}

}
