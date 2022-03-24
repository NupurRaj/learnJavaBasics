package examplePackageForTestNg;

import org.testng.annotations.Test;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class CalculatorTest4 {
	Calculator calc = new Calculator();

  @Test(groups = "AdditionTests")
  public void add1Test() {
	  System.out.println("**Running method addTest1 in testfile CalculatorTest3.java");
	  Assert.assertEquals(10, calc.add1(4, 6));
	  System.out.println("**Completed addTest1 method run..");
  }

  @Test(groups = "AdditionTests")
  public void add2Test() {
	  System.out.println("**Running method addTest2 in testfile CalculatorTest3.java");
	  Assert.assertEquals(10, calc.add1(5, 5));
	  System.out.println("**Completed addTest2 method run..");
  }

  @Test(groups = "SubstractionTests")
  public void sub2Test() {
	  System.out.println("**Running method subTest1 in testfile CalculatorTest3.java");
	  Assert.assertEquals(0, calc.sub1(5, 5));
	  System.out.println("**Completed subTest1 method run..");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Will run/do steps to be performed before each method..");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Will run/do steps to be performed after each method..");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Will run/do setup to be performed before starting class execution..");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Will run/do cleanup to be performed after class execution gets completed..");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Will run/do steps to be performed before running each test..");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Will run/do steps to be performed after running each test..");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Will run/do setup to be performed before starting suite execution..");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Will run/do cleanup to be performed after completing suite execution..");
  }

}
