package prog4_4.closedcurve.good;

public class Test {
	
	public static void main(String[] args) {

		ClosedCurve[] objects = {new Triangle(5,5,5),
								 new Square(3),
								 new Circle(3),
								 new Rectangle(7,3)};
		//compute areas
		for(ClosedCurve cc : objects) {
			System.out.println(cc.computeArea());
			
		}
    
	}

}