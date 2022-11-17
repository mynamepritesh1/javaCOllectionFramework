package exception;

public class NestedTryCatchFInally {
   public static void main(String[] args) {

		try {
			System.out.println("stament -1");
			
			
			try {
				System.out.println(10/0);
				
			} catch (NullPointerException e) {
				System.out.println(10/5);
			}
		System.out.println("stat-3");
		} catch (Exception e) {
			System.out.println("statment-4");
		}
		finally {
			System.out.println("statment-5");
		}
		
		System.out.println("statment -6");
		
		
}
}
