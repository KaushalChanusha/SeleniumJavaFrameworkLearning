package testNGListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
//implement the class by ITestListener interface
public class TestNGListeners implements ITestListener {

	//Invoked after all the tests have run and all their Configuration methods have been called.
	public void onFinish(ITestContext arg0) {
		System.out.println("****** Tests completed: "+arg0.getName());
	}
	
	//Invoked after the test class is instantiated and before any configuration method is called.
	public void onStart(ITestContext arg0) {
		System.out.println("****** Tests started: "+arg0.getName());
	}

	//Invoked each time a method fails but has been annotated with successPercentage and this failure 
	//still keeps it within the success percentage requested.
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {

	}

	//Invoked each time a test fails.
	public void onTestFailure(ITestResult arg0) {
		System.out.println("****** Test is failed: "+arg0.getName());
	}

	//Invoked each time a test is skipped.
	public void onTestSkipped(ITestResult arg0) {
		System.out.println("****** Test is skipped: "+arg0.getName());
	}

	//Invoked each time before a test will be invoked.
	public void onTestStart(ITestResult arg0) {
		System.out.println("****** Test started: "+arg0.getName());

	}

	//Invoked each time a test succeeds.
	public void onTestSuccess(ITestResult arg0) {
		System.out.println("****** Test is sucessful: "+arg0.getName());
	}

}
