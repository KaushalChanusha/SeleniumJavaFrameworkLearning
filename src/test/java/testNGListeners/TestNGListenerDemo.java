package testNGListeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//Set the Listener class by annotation
//If we are runs through testng.xml no need to define this annotation
//@Listeners(testNGListeners.TestNGListeners.class)
public class TestNGListenerDemo {
	@Test
	public void test1() {
		System.out.println("I am inside Test 1");
		
	}
	@Test
	public void test2() {
		System.out.println("I am inside Test 2");
		//Failing Test Case 2 
		Assert.assertTrue(false);
	}
	@Test
	public void test3() {
		System.out.println("I am inside Test 3"  );
		//skipping the test case
		throw new SkipException("Test 3 is skipped");
	}

}
