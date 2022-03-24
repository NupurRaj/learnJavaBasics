package examplePackageForTestNg;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import org.junit.Ignore;
import org.testng.annotations.Test;

public class CalculatorTest2 {
	
	Calculator calc = new Calculator();

  @Test(priority = 0)
  public void add1Test() {
	  Assert.assertEquals(10, calc.add1(4, 6));
  }

  @Test(priority = 3)
  public void add2Test() {
	  Assert.assertEquals(11, calc.add1(5, 4));
  }
 
  @Test(priority = 1)
  public void add3Test() {
	  Assert.assertEquals(10, calc.add1(8, 2));
  }
 
  @Test(priority = 2, dependsOnMethods = "add2Test")
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
	  Assert.assertEquals(16, calc.mul1(4, 4));
  }

  @Test(priority = 8, expectedExceptions = ArithmeticException.class)
  public void devideByZeroTest() {
	  int a = 5;
	  int b = 0;
	  System.out.println("Printing value of 5/0: " + calc.div1(a, b));
  }
  
  @Test(priority = 0, dataProvider = "dp_add")
  public void add0TestDP(int exp_value, int a, int b) {
	  Assert.assertEquals(exp_value, calc.add1(a, b));
  }
  @DataProvider(name="dp_add")
  public  Object[][] intTable(){
	  Object[][] tb1 = new Object[][]{
	  {10,5,5},
	  {8,4,4},
	  {9,5,4},
	  {11,5,5},
	  {10,9,1}
	  };
	  return tb1;
  }
}

