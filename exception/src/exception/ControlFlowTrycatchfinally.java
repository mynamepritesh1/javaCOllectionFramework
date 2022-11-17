package exception;

public class ControlFlowTrycatchfinally {

	public static void main(String[] args) {
//case1 - if there is no exception
//		try {
//			System.out.println("stament -1");
//		} catch (Exception e) {
//			System.out.println("statment-2");
//		}
//		finally {
//			System.out.println("statment-3");
//		}
//		
//		//case 2 if an exception occur in stat -2 and corresponding catch block matched
//		
//		 
//			try {
//				System.out.println("stament -1");
//				System.out.println(10/0);
//				System.out.println("stat-3");
//			} catch (Exception e) {
//				System.out.println("statment-4");
//			}
//			finally {
//				System.out.println("statment-5");
//			}
//			
//			System.out.println("statment -6");
			
			//case 3 if an exception occur in stat -2 and corresponding catch block not matched
			

//			try {
//				System.out.println("stament -1");
//				System.out.println(10/0);
//				System.out.println("stat-3");
//			} catch (NullPointerException e) {
//				System.out.println("statment-4");
//			}
//			finally {
//				System.out.println("statment-5");
//			}
//			
//			System.out.println("statment -6");
			
			
			//case 4 if an exception raised at stat -4
			
//
//			try {
//				System.out.println("stament -1");
//				System.out.println("statment-2");
//				System.out.println("stat-3");
//			} catch (Exception e) {
//				System.out.println(10/0);
//			}
//			finally {
//				System.out.println("statment-5");
//			}
//			
//			System.out.println("statment -6");
		
		//case5 if an exception raised at case 5

		try {
			System.out.println("stament -1");
			System.out.println("statment-2");
			System.out.println("stat-3");
		} catch (Exception e) {
			System.out.println("statment -4");
		}
		finally {
			System.out.println(10/0);
		}
		
		System.out.println(10/0);
			
	}
}

		
	


