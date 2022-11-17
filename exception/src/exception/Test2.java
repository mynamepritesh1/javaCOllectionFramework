package exception;

public class Test2 {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		} catch (Exception e) {
//		System.out.println( 10/2);
//below method are giving exact information of exception occur in program
			System.out.println(e);
			System.out.println(e.toString());
			System.out.println(7);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	   	
	}

