package prog4_6.case2;

import java.util.GregorianCalendar;
@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) {
		PersonWithJob pwj1 = new PersonWithJob("Esam", new GregorianCalendar(2018, 6, 27, 16, 16, 47), 2400);
		PersonWithJob pwj2 = new PersonWithJob("Esam", new GregorianCalendar(2018, 6, 27, 16, 16, 47), 5680);
		PersonWithJob pwj3 = new PersonWithJob("Esam", new GregorianCalendar(2020, 3, 12, 15, 1, 22), 2700);
		PersonWithJob pwj4 = new PersonWithJob("Sam", new GregorianCalendar(2018, 6, 27, 16, 16, 47), 2400);
		PersonWithJob pwj5 = new PersonWithJob("Sam", new GregorianCalendar(2018, 6, 27, 16, 16, 47), 2400);
		System.out.println(pwj5.equals(pwj4));
	}

}
