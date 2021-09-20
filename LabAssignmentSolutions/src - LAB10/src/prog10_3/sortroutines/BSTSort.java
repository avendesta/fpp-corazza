package prog10_3.sortroutines;

import java.util.Arrays;

import prog10_3.runtime.Sorter;

public class BSTSort extends Sorter {

	@Override
	public int[] sort(int[] arr) {
		MyBST bst = new MyBST();
		bst.insertAll(arr);
//		bst.printTree();
		int[] sortedArr = bst.readIntoArray(arr.length);
		return sortedArr;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {5,3,6,2,7,4,67,96,36};
		System.out.println(Arrays.toString(arr));
		BSTSort sorter = new BSTSort();
		System.out.println(Arrays.toString(sorter.sort(arr)));
	}

}
