package jar;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalc {
	@Test
	public void testAddition() {
		Calc calc = new Calc();
		assertEquals(5, calc.add(2, 3));
	}
}
