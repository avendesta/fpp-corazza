package prog8_5;

public class MyTable {
	private Entry[] entries;
	public MyTable() {
		entries = new Entry[26];
	}
	
	//returns the String that is matched with char c in the table
	public String get(char c){
		//implement
		return entries[-97+(int)c].str;
	}
	//adds to the table a pair (c, s) so that s can be looked up using c 
	public void add(char c, String s) {
		entries[-97+(int)c] = new Entry(s,c);
	}
	//returns a String consisting of nicely formatted display
	//of the contents of the table
	public String toString() {
		String res = "";
		for(Entry e: entries) {
			if(e != null)
				res += e.toString();
		}
		return res;
	}
	
	
	private class Entry {
		private String str;
		private char ch;
		Entry(String str, char ch){
			this.str = str;
			this.ch = ch;
		}
		//returns a String of the form "ch->str" 
		public String toString() {
			//implement
			return String.format(" %c -> %s\n", ch, str);
		}
	}

}