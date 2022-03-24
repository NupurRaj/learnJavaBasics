package examplePackageForJunit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest2 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Will run/do Setup to be performed before running a class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Will run/do cleanup to be performed after class execution gets completed");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Will run/do Setup to be performed before running each test in this class");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Will run/do steps to be performed after running each test in this class");
	}

	@Test
	public void assertExample1() {
		System.out.println("*****Exectuing assertExample1 method......");
        String string1="Junit";					
        String string2="Junit";					
        String string3="test";					
        String string4="test";					
        String string5=null;

        assertEquals(string1,string2);					
        assertSame(string3, string4);					
        assertNotSame(string1, string3);					
        assertNotNull(string1);			
        assertNull(string5);
        System.out.println("*****Completed Exectuing assertExample1 method.....");
	}

	@Test(timeout=10000)
	public void assertExample2() {
		System.out.println("*****Exectuing assertExample2 method......");
        int variable1=4;					
        int	variable2=5;					
        int[] airethematicArrary1 = { 1, 2, 3 };					
        int[] airethematicArrary2 = { 1, 2, 3 };

        assertTrue(variable1<variable2);					
        assertArrayEquals(airethematicArrary1, airethematicArrary2);
        System.out.println("*****Completed Exectuing assertExample1 method......");
	}

}
