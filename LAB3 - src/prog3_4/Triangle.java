package prog3_4;

import java.util.Arrays;

public final class Triangle {
	private final double height;
	private final double base;
//	private final double third_side;

	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
//		third_side = Math.sqrt(base*base+height*height);
	}
	
	public Triangle(double s1, double s2, double s3) {
		double[] sides = {s1, s2, s3};
		Arrays.sort(sides);
		base = sides[2];
		// Using Heron's formula to calculate the area and then get the height from it
		double s = 0.5*(s1+s2+s3);	// semi perimeter
		double area = Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
		height = 2*area/base;
	}
	
	public double computeArea() {
		return 0.5*height*base;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getBase() {
		return base;
	}
	
}
