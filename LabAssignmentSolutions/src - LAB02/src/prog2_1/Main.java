package prog2_1;

public class Main {

	public static void main(String[] args) {
		Address add1A = new Address("10 Illinois", "Chicago", "CH", "60610");
		Address add1B = new Address("110 Burlington", "Fairfield", "IA", "52556");
		Address add2B = new Address("2210 SomewhereinChicago", "Chicago", "Ch", "60010");

		Customer c1 = new Customer("Kyaw","Thiha");
		Customer c2 = new Customer("Michael", "Jackson");
		
		c1.setSSN("434-342-594);");
		c2.setSSN("543-874-479");
		
		c1.setBillingAddress(add1B);
		c1.setShippingAddress(add1B);
		c2.setBillingAddress(add1A);
		c2.setShippingAddress(add2B);
		
		Customer[] customers = new Customer[2];
		customers[0] = c1;
		customers[1] = c2;
		
		for(Customer c : customers){
			if(c.getBillingAddress().getCity()=="Chicago")
				System.out.println(c.toString());
		}
	}

}
