package prog5_1;

public class Main {

	public static void main(String[] args) {
		MySingleton ms1 = MySingleton.singletonInstance;
		MySingleton ms2 = MySingleton.singletonInstance;
		System.out.println(ms1==ms2);
	}

}
