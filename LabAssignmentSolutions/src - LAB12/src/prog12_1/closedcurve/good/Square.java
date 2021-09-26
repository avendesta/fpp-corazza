package prog12_1.closedcurve.good;

public class Square extends ClosedCurve {
	double side;
	public Square(Double side) throws IllegalClosedCurveException {
		this(side.doubleValue());
	}
	public Square(double side) throws IllegalClosedCurveException {
		if(side>=0)
			this.side = side;
		else
			throw new IllegalClosedCurveException("IllegalClosedCurveException: side cannot be negative!");
	}
	double computeArea() {
		return(side*side);
	}

}
