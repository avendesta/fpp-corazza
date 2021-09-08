package prog3_3;
// https://sakai.cs.miu.edu/portal/presence/70e9cf8a-f647-4917-b054-c3a7130beff4?output_fragment=yes&auto=true&_=1630602507433
import java.util.Arrays;

public class MyStringList {
	private final int INITIAL_LENGTH = 2;
	private String[] strArray; 
	private int size;
	
	public MyStringList() {
		strArray = new String[INITIAL_LENGTH];
		size = 0;
	}
	
	public void add(String s){
		if(strArray.length<=size)
			resize();
		strArray[size] = s;
		size++;
	}
	
	public String get(int i){
		if(i>=size)
			return null;
		return strArray[i];
	}
	
	public boolean find(String s){
		for(int i = 0; i<size; i++)
			if(strArray[i].equals(s))
				return true;
		return false;
	}
	
	public void insert(String s, int pos){
		if(pos>=size)
			resize();
		strArray[pos] = s;
	}
	
	public boolean remove(String s){
		// get the index of the first occurence of the string s
		for(int i = 0; i<size;i++)
			if(strArray[i].equals(s)) {
				size--; 
				String[] newStrArray = new String[size];
				System.arraycopy(strArray, 0, newStrArray, 0, i);
				System.arraycopy(strArray, i+1, newStrArray, i, size-i);
				strArray = newStrArray;
				return true;
			}
				
		return false;
	}
	
	
	private void resize(){
		String[] newStrArray = new String[2*size];
		System.arraycopy(strArray, 0, newStrArray, 0, size);
		strArray = newStrArray;
		System.out.println("Resizing ...");
	}
	public String toString(){
		String[] sizedStrArray = new String[size];
		System.arraycopy(strArray, 0, sizedStrArray, 0, size);
		return Arrays.toString(sizedStrArray);
	}
	public int size() {
		return size;
	}

	public static void main(String[] args){
		MyStringList l = new MyStringList();
		l.add("Bob");
		l.add("Steve");
		l.add("Susan");
		l.add("Mark");
		l.add("Dave");
		System.out.println("The list of size "+l.size()+" is "+l);
		l.remove("Mark");
		l.remove("Bob");
		System.out.println("The list of size "+l.size()+" is "+l);
		l.insert("Richard",3);
		System.out.println("The list of size "+l.size()+" after inserting Richard into pos 3 is "+l);
		l.insert("Tonya",0);
		System.out.println("The list of size "+l.size()+" after inserting Tonya into pos 0 is "+l);		
/*
		MyStringList l = new MyStringList();
		l.add("Bob");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Steve");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Susan");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Mark");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Dave");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.remove("Mark");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.remove("Bob");
		System.out.println("The list of size " + l.size() + " is " + l);
		*/
	}

}
