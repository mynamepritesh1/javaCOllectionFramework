package exception;


public class TryWithMultCatch {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		} catch (ArithmeticException e) {
			System.out.println("text.text");
		}
		catch (Exception e) {
			System.out.println(12345);
		}

	}

}
