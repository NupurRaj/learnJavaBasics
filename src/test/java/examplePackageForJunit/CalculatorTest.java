package examplePackageForJunit;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	Calculator calc = new Calculator();

	@Test
	public void testAdd1() {
		assertEquals(10, calc.add1(5, 5));
	}

	@Test
	public void testSub1() {
		assertEquals(2, calc.sub1(10, 8));
	}

}
