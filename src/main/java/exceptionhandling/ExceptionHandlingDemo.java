package exceptionhandling;

public class ExceptionHandlingDemo {
	
	public static void main(String[] args) {
		
		
		
		try {
			
			System.out.println("Hello World...!!!");
			
			int i = 5/0; //Arithmetic exception is here
			
		} 
		
		catch (Exception e) {
			
			System.out.println("I am inside catch block");
			System.out.println("Message is : "+e.getMessage());//giving the message about exception
			System.out.println("Cause is: "+e.getCause());//giving the cause of the exception
			e.printStackTrace();//print the error message
			
		}
		finally {
			//finally block can use for any code that having exception or not that you want to execute
			System.out.println("I am inside finally block");
		}
		
	}
	

}
