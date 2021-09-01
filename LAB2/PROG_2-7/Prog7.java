package Prog2_7;

import static Prog2_7.RandomNumbers.getRandomInt;

public class Prog7 {

	public static void main(String[] args) {
		
		String output = "";
		
		// first row
		output += String.format("%16d %12d %12d %12d %n", getRandomInt(1,99), getRandomInt(1,99), 1+(int)(Math.random()*99), getRandomInt(1,99));
		output += String.format("%13s %2d %9s %2d %9s %2d %9s %2d %n","+", getRandomInt(1,99), "+", getRandomInt(1,99), "+", getRandomInt(1,99), "+", getRandomInt(1,99));
		output += String.format("%16s %12s %12s %12s","____", "____", "____", "____");
		output += String.format("\n\n\n\n\n", "");
		
		// second row
		output += String.format("%16d %12d %12d %12d %n", getRandomInt(1,99), getRandomInt(1,99), getRandomInt(1,99), getRandomInt(1,99));
		output += String.format("%13s %2d %9s %2d %9s %2d %9s %2d %n","+", getRandomInt(1,99), "+", getRandomInt(1,99), "+", getRandomInt(1,99), "+", getRandomInt(1,99));
		output += String.format("%16s %12s %12s %12s","____", "____", "____", "____");
		output += String.format("%n %n", "");
		
		System.out.println(output);
	}

}
