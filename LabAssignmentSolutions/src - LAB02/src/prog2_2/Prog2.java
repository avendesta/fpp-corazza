package prog2_2;
import java.lang.Math;

public class Prog2 {
	public static void main(String[] args) {
		int x = RandomNumbers.getRandomInt(1, 9);
		double pi_x = Math.pow(Math.PI, x);
		
		int y = RandomNumbers.getRandomInt(3,14);
		double y_pi = Math.pow(y, Math.PI);
		
		System.out.println("pi raised to x: "+pi_x);
		System.out.println("y raised to pi: "+y_pi);
	}
}
