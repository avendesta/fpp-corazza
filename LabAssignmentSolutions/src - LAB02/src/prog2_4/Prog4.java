package prog2_4;

public class Prog4 {

	public static void main(String[] args) {
		String data = Data.records;
		String[] rows = data.split(":");
		for(String r: rows)
			System.out.println(r.substring(0, 4));

	}

}
