package by.epam.hw13.regex.validator.exception;

public class UserDataValidatorException extends Exception {

	private static final long serialVersionUID = -3898527617224037503L;

	public UserDataValidatorException() {
		super();
	}

	public UserDataValidatorException(String message) {
		super(message);
	}

	public UserDataValidatorException(Exception e) {
		super(e);
	}

	public UserDataValidatorException(String message, Exception e) {
		super(message, e);
	}

}
