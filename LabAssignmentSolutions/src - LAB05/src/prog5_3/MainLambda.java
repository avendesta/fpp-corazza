package prog5_3;

import java.util.Arrays;
import java.util.Comparator;

public class MainLambda {
	public static void main(String[] args) {
		String[] testStrings = { "andy", "mike", "joe", "allen", "stephan" };
		Comparator<String>	comparator = (o1,o2)->{
													if(o1.length() < o2.length()) return -1;
													else if(o1.length() > o2.length()) return 1;
													else return 0;
												};
		StringSort ss = new StringSort(comparator);
		ss.stringSort(testStrings);
		System.out.println(Arrays.asList(testStrings));
	}
	}

