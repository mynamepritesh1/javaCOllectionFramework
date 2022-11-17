package exception;

public class FinallyWithMain {

	public static void main(String[] args) {
		
		System.out.println(m1());
		
	}
		@SuppressWarnings("finally")
		public static int m1() {
			
			try {
				
				return 777;
			} catch (Exception e) {
				
				return 888;
				
			}
			finally {
				return 999;
			}
			
			
		}
	}


