package prog7_2;

public class MinSort {
	
	public String sort(String str) {
		if(str == null || str.length() <= 1)
			return str;
		int minpos = minPos(str);
		// swap the first character with the minimum character
		char[] strChar = str.toCharArray();
		char temp = strChar[minpos];
		strChar[minpos] = str.charAt(0);
		strChar[0] = temp;
		str = String.valueOf(strChar);
		//
		return str.charAt(0)+sort(str.substring(1));	
	}
	
	public int minPos(String str) {
		int minpos = 0;
		for(int i=0; i<str.length(); i++)
			if(str.charAt(minpos)>str.charAt(i))
				minpos = i;
		return minpos;
	}
}
