package exception;

public class FInally {
   public static void main(String[] args) {
	 //if exception occur or not finally block will execute
	try {
		System.out.println("try");
		System.out.println(10/0);
		
	} catch (ArithmeticException e) {
		System.out.println(10/2);
	}
	finally {
         System.out.println("finally");
	}

	   
   
//if an exception is not handled then also finally block will executed always
       try {
		System.out.println(10/0);
	} catch (NullPointerException e) {
		// TODO: handle exception
		System.out.println("catch");
	}  
       finally {
    	   System.out.println("hello");
       }
   }
     
  
}





