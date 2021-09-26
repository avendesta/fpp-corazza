package prog4_4.closedcurve.good;

public class Test2 {
	
	public static void main(String[] args) {

		Polygon[] objects = {new Square(3),
							 new Triangle(4,5,6),
							 new Rectangle(3,4)};
		//compute areas
		for(Polygon cc : objects) {
			System.out.format("For this %s\n",cc.getClass().getSimpleName());
			System.out.format("\tNumber of sides = %d\n", cc.getNumberOfSides());
			System.out.format("\tPerimeter = %4.1f\n", cc.computePerimeter());
			
		}
    
	}

}