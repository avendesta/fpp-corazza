package Prog2_6;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class TestProg6 {
	@Test
	public void testRemoveDups() {
		// String[] names = {"horse", "dog", "cat", "horse","dog"};
		String[] names = Prog6.testData;
		String[] unique = Prog6.removeDups(names);
		String[] expected = {"horse","dog","cat"};
		assertArrayEquals(expected, unique);
	}
}