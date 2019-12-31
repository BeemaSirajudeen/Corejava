package exceptionhandling;

public class ExceptionHandlingExample1 
{
   static void check() throws ArithmeticException
		{
			System.out.println("Inside check function");
			throw new ArithmeticException("FACE Kollam");
			
		}
		public static void main(String[] args) 
		{
		   try                                 //try,catch block is used for exception handling
		   {                                  // the output must be arithmetic exception
		     check();
		   }
		   catch(ArithmeticException e)
		   {
			   System.out.println("caught "+ e);
		   }
	}

}
