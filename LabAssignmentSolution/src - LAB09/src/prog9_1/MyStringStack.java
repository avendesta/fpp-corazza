package prog9_1;

public class MyStringStack {
	private MyStringLinkedList list;
	public MyStringStack() {
		list = new MyStringLinkedList();
	}
	
	public String pop() {
		String top = list.get(0);
		list.remove(0);
		return top;
	}
	public String peek() {
		return list.get(0);
	}
	
	public void push(String s) {
		list.insert(s, 0);
	}
}
