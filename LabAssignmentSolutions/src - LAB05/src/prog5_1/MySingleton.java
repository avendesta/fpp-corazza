package prog5_1;

public class MySingleton {
	public static final MySingleton singletonInstance = mySingletonMethod();
	private MySingleton() {
		// nothing here
	}

	private static MySingleton mySingletonMethod() {
		return new MySingleton();
	}
	
}


