package jar;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalc {
	Calc calc = new Calc();

	@Test
	public void testAddition() {
		assertEquals(5, calc.add(2, 3));
	}

	@Test
	public void testSubtract() {
		assertEquals(10, calc.subtract(15, 5));
	}
}
