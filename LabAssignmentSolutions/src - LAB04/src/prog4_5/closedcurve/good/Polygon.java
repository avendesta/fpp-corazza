package prog4_5.closedcurve.good;

public interface Polygon {
	public int getNumberOfSides();
	
	public double[] getArrayOfSides();
	static double sum(double[] arr) {
		double total = 0.0;
		for(double c: arr)
			total += c;
		return total;
	};
	default double computePerimeter() {
		return Polygon.sum(getArrayOfSides());
	}; 
	
	
}
