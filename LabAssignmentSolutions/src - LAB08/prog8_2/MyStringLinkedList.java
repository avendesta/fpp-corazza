package prog8_2;

public class MyStringLinkedList {
	Node header;
	MyStringLinkedList(){
		header = new Node(null);
	}
	//adds to the front of the list
	public void addFirst(String item){
		Node n = new Node(item);
		//place new node after header and 
		//establish links from new node to 
		//surrounding nodes
		n.next = header.next;
		n.previous = header;
		
		//establish links from surrounding 
		//nodes to the new node
		if(header.next != null){
			header.next.previous = n;
		}		
		header.next = n;	
	}
	
	//adds to the end of the list
	public void addLast(String item) {
		Node n = new Node(item);
		//find last node
		Node last = header;
		while(last.next != null) {
			last = last.next;
		}
		//now last.next == null
        last.next = n;
        n.previous = last;
	}
	
	//removes node in last position
	public void removeLast( ) {
		//if list is empty, return
		if(header.next == null) return;
		
		Node current = header;
		//traverse the list until current.next is 
		//null - then remove current
		while(current.next != null) {
			current = current.next;
		}
		//now current.next == null, so remove current
		Node previous = current.previous; 
		//previous is not null since current is not header
		previous.next = null;
		current.previous = null;
	}
	
	//determines whether the input string is in the list
	public boolean search(String s) {
		Node next = header.next;
		while(next != null && !next.value.equals(s)) {
			next = next.next;
		}
		//either next == null or next.value is s
		if(next == null) return false;
		else {//next.value.equals(s) 
			return true;
		}
	}
	public String toString() { 
		var sb = new StringBuffer();
		Node next = header.next;
		while(next != null) {
			sb.append(next.toString() + ", ");
			next = next.next;
		}
		var result = sb.toString().trim();
		if(result.length() == 0) return "<empty list>";
		if(result.charAt(result.length()-1) == ',') {
			return result.substring(0,result.length()-1);
		}
		return result;			
	}
	
	//inserts a new Node containing data so that its
	//position in the list is now pos
	void insert(String data, int pos) {
		if(data == null || pos<0) return;
		Node newNode = new Node(data);
		Node currentNode = header;
		for(int i=0; i<pos; i++) {
			if(currentNode.next == null) return;
			currentNode = currentNode.next;
		}

		newNode.previous = currentNode;
		newNode.next = currentNode.next;
		currentNode.next.previous = newNode;
		currentNode.next = newNode;
		
	}
	//attempts to remove the first Node that contains
	//data; if successful, returns true; otherwise, false.
	boolean remove(String data) {
		if(header.next == null) return false;
		Node currentNode = header;
		while(currentNode != null) {
			if(currentNode.value != null && currentNode.value.equals(data)) {
//				Node tempNode = currentNode;
				currentNode.previous.next = currentNode.next;
				if(currentNode.next != null) // in case its the last element
					currentNode.next.previous = currentNode.previous;
				return true;
			}
			currentNode = currentNode.next;
		}

		return false;
	}
	
	/******* sorting methods ********/
	public void minSort(){
		Node currentNode = header.next;
		Node minNode;
		while(currentNode.next != null) {
			minNode = minNode(currentNode);
			swap(currentNode, minNode);
			currentNode = currentNode.next;
		}
	}

	// swap two nodes
	void swap(Node n1, Node n2){
		String tempValue = n1.value;
		n1.value = n2.value;
		n2.value = tempValue;
	}
	
	// finds a Node with minimum value between a startNode and those that follow it
	Node minNode(Node startNode) {
		if(startNode.next == null) return startNode;
		Node currentNode = startNode;
		Node minNode = startNode;
		while(currentNode.next != null && currentNode.next.value != null) {
			if( minNode.value.compareTo(currentNode.next.value)>0) {
				minNode = currentNode.next;
				}
			currentNode = currentNode.next;
		}
		return minNode;
	}

	class Node {
		String value;
		Node next;
		Node previous;
		Node(String value){
			this.value = value;
		}
		
		public String toString() {
			return value == null ? "null" : value;
		}
	}

	public static void main(String[] args){
		var list = new MyStringLinkedList();
		list.addLast("Rich");
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		list.addFirst("Bob");
		list.addFirst("Harry");
		list.addFirst("Steve");
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		System.out.println(list.search("Harry"));
		System.out.println(list.search("Bob"));
		list.addLast("Tom");
		System.out.println(list);
	}
}
