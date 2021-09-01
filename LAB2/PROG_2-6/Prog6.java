package Prog2_6;

import java.util.Arrays;

public class Prog6 {

	static String[] testData = {"horse", "dog", "cat", "horse","dog"};
	public static String[] removeDups(String[] dupl) {
		String[] uniq = new String[dupl.length];
		int size = 0;
		boolean duplicate;
		for(int i=0; i<dupl.length; i++) {
			duplicate = false;
			for(int j=i-1; j>=0 ; j--) {
				if(dupl[i].equals(dupl[j])) {
					duplicate = true;
					break;
				}
			}
			if(!duplicate) {
				uniq[size] = dupl[i];
				size++;
			}
		}

		String[] unique = Arrays.copyOf(uniq,size);
		return unique;
	}
	
	
	public static void main(String[] args) {
//		String[] testData = {"horse", "dog", "cat", "horse","dog"};
		String[] uniqueData = removeDups(testData);
		System.out.println(Arrays.toString(uniqueData));
	}

}
