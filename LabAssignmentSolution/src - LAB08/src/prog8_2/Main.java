package prog8_2;

public class Main {

	public static void main(String[] args) {
		String[] words = {
				"big", "small", "tall", "short", "round", "square",
				 "enormous", "tiny","gargantuan", "lilliputian",
				 "numberless", "none", "vast", "miniscule"
		};
		
		MyStringLinkedList wordStore = new MyStringLinkedList();
		wordStore.addFirst(words[0]);
		for(int k=1; k<words.length; k++)
			wordStore.addLast(words[k]);
		
		System.out.println("Before sorting");
		System.out.println(wordStore);
		wordStore.minSort();
		System.out.println("\nAfter sorting");
		System.out.println(wordStore);
	}

}
