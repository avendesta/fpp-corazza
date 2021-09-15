package prog8_1;

/**
 * Performs binary search on a sorted array using an iterative approach
 */
public class BinSearchIterative {
	public static boolean binSearchIt(MyStringList list, String val) {
		if (list == null || list.size() == 0)
			return false;
		int lower = 0;
		int upper = list.size() - 1;
		while (true) {
			if (lower > upper)
				return false;
			int mid = (lower + upper) / 2;
			if (val.compareTo(list.get(mid)) == 0)
				return true;
			if (val.compareTo(list.get(mid)) < 0) { // search left
				upper = mid - 1; // lower is not changed
			} else { // val > list[mid], search right
				lower = mid + 1; // upper is not changed
			}
		}
	}

}
