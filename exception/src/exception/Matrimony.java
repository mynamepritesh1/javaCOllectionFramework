package exception;

public class Matrimony {

	public static void main(String[] args)  {
		  
		int age = (args.length>0)? Integer.parseInt(args[0]):19;
		if(age>60) {
			throw new TooYoungException("Your age is already crossed marriage age, no chance of gettig marriage!!!");
		}
		
		else if(age<18) {
			throw new TooOldExeption("Please wait for some time you will get great match!!!");
		}
		else {
			System.out.println("Thank a lot you will notify through email if you get great match!!");
		}
		

	}

}
