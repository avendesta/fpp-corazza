package prog7_3;

import java.util.LinkedList;

/**
 * Recursively merges two sorted linked lists
 *
 */
public class Merge {
	LinkedList<Integer> list3 = new LinkedList<Integer>();
	public LinkedList<Integer> merge(LinkedList<Integer> list1, LinkedList<Integer> list2) {
//		if(list1.isEmpty() && list2.isEmpty()) return list3;
		if(list1.isEmpty()) {list3.addAll(list2); return list3; };
		if(list2.isEmpty()) {list3.addAll(list1); return list3; };
		
		if(list1.get(0)<list2.get(0)) {
			list3.add(list1.get(0));
			list1.removeFirst();
			merge(list1, list2);
		}
		else {
			list3.add(list2.get(0));
			list2.removeFirst();
			merge(list1, list2);
		}
		return list3;
	}
	//test your code
	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<>();
		LinkedList<Integer> list2 = new LinkedList<>();
		list1.add(4);list1.add(5);list1.add(21);list1.add(25);
		list2.add(2);list2.add(9);list2.add(17);
		Merge m = new Merge();
		System.out.println(list1);
		System.out.println(list2);
		LinkedList<Integer> list3 = m.merge(list1, list2);
		if(list3 != null) System.out.println(list3);
		
	}
}
