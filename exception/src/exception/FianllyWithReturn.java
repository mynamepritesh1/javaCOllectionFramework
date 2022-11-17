package exception;

public class FianllyWithReturn {

	public static void main(String[] args) {
		//finally with return 
	       try {
			System.out.println("hii");
			return;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(" i am ");
		}
	       finally {
	    	   System.out.println("pritesh");
	       }
		}  
}
