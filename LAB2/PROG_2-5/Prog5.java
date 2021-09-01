package Prog2_5;

import java.util.Scanner;

public class Prog5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter string from the console: ");
		String user_input = input.nextLine();
		input.close();
		for(int i = user_input.length()-1; i>=0; i--)
			System.out.print(user_input.charAt(i));
			
	}

}
