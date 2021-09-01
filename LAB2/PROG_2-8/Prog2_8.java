package Prog2_8;

public class Prog2_8 {

	static int min(int[] arrayOfInts) {
		int minimum = arrayOfInts[0];
		for(int i: arrayOfInts)
			if(minimum>i)
				minimum = i;
		return minimum;
	}

	public static void main(String[] args) {
		System.out.println(min(new int[]{-1,3,-3,5,8}));
	}
}
