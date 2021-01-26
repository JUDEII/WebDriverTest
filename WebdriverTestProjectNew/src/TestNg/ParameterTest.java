package TestNg;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class ParameterTest {

	@Test(invocationCount = 3)
	public void Test1() {
		System.out.println("Test 1");
	}
	
	@Test(priority=1)
	public void Test2() {
		System.out.println("Test 2");
	}
	
	@Test(enabled=false)
	public void Test4() {
		System.out.println("Test 4");
	}
	
	@Test
	public void Test5() {
		throw new SkipException("skip this test"); //this will run but skip this test
	}
	
	@Test(dependsOnMethods = {"Test1"}) //this will first execute Test1 before executing Test6
	public void Test6() {
		System.out.println("Test 6");
	}
	
	@Test(groups= {"sanity"})
	public void Test7() {
		System.out.println("Test 7");
	}
	
	@Test(groups= {"sanity","Regression"})
	public void Test8() {
		System.out.println("Test 8");
	}
	@Test
	public void Test9() {
		System.out.println("Test 9");
	}
	
	@Test
	public void Test10() {
		System.out.println("Test 10");
	}
	
	@Test
	public void Test11() {
		System.out.println("Test 11");
	}
	
	//invocationCount : runs the test x number of times
	//priority : runs the test from priority 1
	//enabled = false : testng will not run/recognise that test
	//groups = this groups tests together and runs them
	
}
