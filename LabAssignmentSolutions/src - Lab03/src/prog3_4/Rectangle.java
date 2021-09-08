package prog3_4;

public final class Rectangle {
	private final double width;
	private final double height;
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	public double computeArea() {
		return width*height;
	}
	
	public double getWidth() {
		return this.width;
	}
	public double getHeight() {
		return this.height;
	}
	
}
