package prog4_5.closedcurve.good;

public class Test3 {
	
	public static void main(String[] args) {

		Polygon[] objects = {new Square(3),
							 new Triangle(4,5,6),
							 new Rectangle(3,4)};
		//compute areas
		for(Polygon cc : objects) {
			System.out.format("For this %s\n",cc.getClass().getSimpleName());
			System.out.format("\tPerimeter = %4.1f\n", cc.computePerimeter());
			
		}
    
	}

}