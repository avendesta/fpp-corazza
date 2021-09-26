public class Pensil4 extends SuperClass {
	Pensil4() {
		System.out.println("In BadInherit");
	}

	public static void main(String[] args) {
		new Pensil4();
	}
}

class SuperClass {
	SuperClass() {
		System.out.println("In SuperClass");
		new Pensil4();
	}
}