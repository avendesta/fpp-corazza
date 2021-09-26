package prog9_2;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

@SuppressWarnings("unused")
public class SymbolBalancer {
	String ODD_DELIMITER = ""+(char)0;
	String filename;
	String text;
	char[] left;
	char[] right;
	public SymbolBalancer(String filename) {
		this.filename = filename;
		readFile();
	}
	public void setText(String text) {
		this.text = text;
	}
	
	
	boolean symbolsBalanced(String delimiters){
		if(delimiters.length()%2==1) return false; // if there delimiters do not exist in pair
		int delimiterCount = delimiters.length()/2;
		char[] openDelimiters = new char[delimiterCount];
		char[] closeDelimiters = new char[delimiterCount];
		for(int i=0; i<delimiterCount; i++) {
			openDelimiters[i] = delimiters.charAt(2*i);
			closeDelimiters[i] = delimiters.charAt(2*i+1);
		}

		Stack<Character> stack = new Stack<Character>();
		char topOpening;
		for(var ch: text.toCharArray()) {
			if((new String(openDelimiters).indexOf(ch) >= 0)) {
				stack.push(ch);
				topOpening = ch;
				continue;
			}
			if((new String(closeDelimiters).indexOf(ch) >= 0)) {
				if(stack.isEmpty()) return false;
				topOpening = stack.pop();
				int op = (new String(openDelimiters).indexOf(topOpening));
				int cl = (new String(closeDelimiters).indexOf(ch));
				if( op != cl )
					return false;
			}
		}
		if(stack.isEmpty()) return true;
		return false;
		
	}
	
	public static void main(String[] args) {
		SymbolBalancer sb = new SymbolBalancer("prog9_2\\Employee.java");
		System.out.println(sb.symbolsBalanced("[]{}<>()"));
	}
	void readFile() {
		String prefix = System.getProperty("user.dir") + "\\src\\";
		try {
			Scanner sc = new Scanner(new File(prefix + filename));
			sc.useDelimiter(ODD_DELIMITER);
			text = sc.next();
//			System.out.println(text);
			sc.close();
		}
		catch(FileNotFoundException ex) {
			System.err.println("File Not Found Exception " + ex.getMessage());
		}
	}
	
}