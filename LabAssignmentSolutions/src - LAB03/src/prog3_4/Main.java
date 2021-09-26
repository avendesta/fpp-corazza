package prog3_4;

public class Main {

	public static void main(String[] args) {
		Circle c1 = new Circle(3);
		Rectangle r1 = new Rectangle(3,7);
		Triangle t1 = new Triangle(2,6);
		Triangle t2 = new Triangle(3,4,5);
		
		System.out.println("Area of Cirle 1 is: " + c1.computeArea());
		System.out.println("Area of Rectangle 1 is: " + r1.computeArea());
		System.out.println("Area of Triangle 1 is: " + t1.computeArea());
		System.out.println("Area of Triangle 2 is: " + t2.computeArea());
		
	}

}
