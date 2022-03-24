package examplePackageForJunit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CalculatorTest.class, CalculatorTest2.class })
public class CalculatorTestJunitSuite {
	//Need to know that what all actions can be performed here, as we are mentioning all the classes to be run in top

}
