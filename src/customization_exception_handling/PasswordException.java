package customization_exception_handling;

public class PasswordException extends IllegalArgumentException{
	public PasswordException(String message) {
		super(message);
	}
}
