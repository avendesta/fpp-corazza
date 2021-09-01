package Prog2_8;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Prog2_8Test {
	@Test
	public void testMin() {
		int[] nums = new int[] {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
		int expected = -22;
		int result = Prog2_8.min(nums);
		
		assertEquals(expected, result);
	}
	
}
