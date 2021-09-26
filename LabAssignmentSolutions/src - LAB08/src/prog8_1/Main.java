package prog8_1;

public class Main {

	public static void main(String[] args) {
		MyStringList words = new MyStringList(new String[] {
				"big", "small", "tall", "short", "round", "square",
				 "enormous", "tiny","gargantuan", "lilliputian",
				 "numberless", "none", "vast", "miniscule"
		} );
		System.out.format("\nBefore MinSort:\n %s", words);
		words.minSort();
		System.out.format("\nAfter MinSort:\n %s", words);
		
		System.out.println("\n\n");
		System.out.println(words.binSearchIt("number"));
		System.out.println(words.binSearchIt("tiny"));
		
	}

}
