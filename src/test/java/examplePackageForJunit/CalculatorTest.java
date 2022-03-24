package examplePackageForJunit;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	Calculator calc = new Calculator();

	@Test
	public void testAdd1() {
		System.out.println("****Exectuing testAdd1 method.....");
		assertEquals(10, calc.add1(5, 5));
		System.out.println("****Completed Exectuing assertExample1 method.....");
	}

	@Test
	public void testSub1() {
		System.out.println("****Exectuing testSub1 method.....");
		assertEquals(2, calc.sub1(10, 8));
		System.out.println("****Completed Exectuing assertExample1 method.....");
	}

}
