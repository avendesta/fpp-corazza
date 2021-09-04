package prog3_1;

public class Main {

	public static void main(String[] args) {
		Employee employee = new Employee("Kyaw Thihi", "Cho", 8000, 2022, 10, 23);
		Account acc1 = new Account(employee, AccountType.CHECKING, 300);
		Account acc2 = new Account(employee, AccountType.RETIREMENT, 300);
		Account acc3 = new Account(employee, AccountType.SAVINGS, 300);
		
		System.out.println(acc1.toString());
		System.out.println(acc2.toString());
		System.out.println(acc3.toString());
		
	}

}
