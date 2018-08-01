package testcases;

import org.testng.SkipException;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Testcase1Test {
	String T = "Test";

	@Test(priority=1,groups={"T1"})
	public void method1() {
		System.out.println("Testing 1");
		
	}
	
	@Test(priority=2,groups={"T2"})
	public void method2() {
		System.out.println("Testing 2");
		
	}
	
	@Test(priority=3,groups={"T3"})
	public void method3() {
		System.out.println("Testing 3");
		
	}
	
	
	// This is the way you skip 
	@Test(priority=4,groups={"T4"})
	public void method4() {
		if (T.contentEquals("Test")) {
			throw new SkipException ("I am skipped as T Equal to "+T);
		}
		
	}
	
	// If Method 4 is skipped then Method 
	@Test(priority=5,groups={"T5"},dependsOnMethods= {"method4"})
	public void method5() {
		System.out.println("I should be skipped");
		
		
	}
	
	
	
	
}
