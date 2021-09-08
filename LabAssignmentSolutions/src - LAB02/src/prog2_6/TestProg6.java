package prog2_6;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.Arrays;

public class TestProg6 {
	@Test
	public void testRemoveDups() {
		// String[] names = {"horse", "dog", "cat", "horse","dog"};
		String[] names = Prog6.testData;
		String[] unique = Prog6.removeDups(names);
		String[] expected = {"horse","dog","cat"};
		assertEquals(Arrays.toString(expected), Arrays.toString(unique));
	}
}