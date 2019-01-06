package exceptionhandling;

public class ExceptionHandlingDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			demo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//exception is throws to main method and handling from there.
	public static void demo() throws Exception{
		
		System.out.println("Hello World...!!!");
		//throw new ArithmeticException("Not Valid");
		int i = 5/0; //Arithmetic exception is here
	}

}
