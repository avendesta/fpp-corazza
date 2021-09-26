package prog12_1.closedcurve.good;

public class Rectangle extends ClosedCurve {

	private double width;
	private double length;
	public Rectangle(double width, double length) throws IllegalClosedCurveException {
		if(length<0 || width<0)
			throw new IllegalClosedCurveException("IllegalClosedCurveException: side cannot be negative!");

		this.length = length;
		this.width = width;
	}
	double computeArea() {
		return width*length;
	}
	


}
