package exception;

//@SuppressWarnings("serial")
public class TooYoungException extends RuntimeException {
    
	TooYoungException(String message){
		super(message);
	}
}
