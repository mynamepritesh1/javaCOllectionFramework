package exception;

public class Throwkeyword {
	;
	public static void main(String[] args) throws InterruptedException  {
		
		doStuff();
	}
			public static void doStuff() throws InterruptedException {
				domoreStuff();
			}
					public static void domoreStuff() throws InterruptedException {
					Thread.sleep(100);
					System.out.println("PRITESH");
				}
			
}



  