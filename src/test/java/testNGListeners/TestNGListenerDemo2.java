package testNGListeners;

import org.testng.annotations.Test;

//Set the Listener class by annotation
//If we are runs through testng.xml no need to define this annotation
//@Listeners(testNGListeners.TestNGListeners.class)
public class TestNGListenerDemo2 {
	@Test
	public void test4() {
		System.out.println("I am inside Test 4");
	}
	@Test
	public void test5() {
		System.out.println("I am inside Test 5");
	}
	@Test
	public void test6() {
		System.out.println("I am inside Test 6"  );
	}

}
