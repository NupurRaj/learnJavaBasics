package examplePackageForTestNg;

import org.junit.Ignore;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class CalculatorTest {
	
	Calculator calc = new Calculator();

  @Test(priority = 0)
  public void add1Test() {
	  Assert.assertEquals(10, calc.add1(4, 6));
  }

  @Test(priority = 3)
  public void add2Test() {
	  Assert.assertEquals(10, calc.add1(5, 4));
  }
 
  @Test(priority = 1)
  public void add3Test() {
	  Assert.assertEquals(10, calc.add1(8, 2));
  }
 
  @Test(priority = 2, dependsOnMethods = "add2test")
  public void add4Test() {
	  Assert.assertEquals(10, calc.add1(4, 6));
  }
 
  @Test(priority = 5)
  public void sub1Test() {
	  Assert.assertEquals(4, calc.sub1(10, 6));
  }
 
  @Ignore
  @Test(priority = 6)
  public void sub2Test() {
	  Assert.assertEquals(4, calc.sub1(8, 4));
  }

  @Test(priority = 7)
  public void mul1Test() {
	  Assert.assertEquals(16, calc.sub1(4, 4));
  }

//  @Test(priority = 8, class.excp)
//  public void devideByZeroTest() {
//	  int a = 5;
//	  int b = 0;
//	  int sum = a/b;
//  }
}
