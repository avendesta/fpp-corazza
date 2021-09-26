package prog12_1.closedcurve.good;

public class Circle extends ClosedCurve {
	double radius;
	public Circle(Double radius) throws IllegalClosedCurveException {
		this(radius.doubleValue());
	}
	public Circle(double radius) throws IllegalClosedCurveException {
		if(radius>=0)
			this.radius = radius;
		else
			throw new IllegalClosedCurveException("IllegalClosedCurveException: radius cannot be negative!");
	}
	double computeArea() {
		return (Math.PI * radius * radius);
	}
}
