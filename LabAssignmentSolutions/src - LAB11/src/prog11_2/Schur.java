package prog11_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Schur {

	boolean checkForSum(List<Integer> list, Integer z) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(Integer i: list) {
			if(hm.get(z-i) != null)
				return true;
			hm.put(i, i);
		}
		return false;
	}
	public static void main(String[] args) {
		Schur sh = new Schur();
		List<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
//		list.add(-5);
		list.add(-2);
		System.out.println(sh.checkForSum(list, 1));
	}

}
