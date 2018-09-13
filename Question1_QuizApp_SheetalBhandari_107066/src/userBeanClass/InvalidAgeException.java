package userBeanClass;

public class InvalidAgeException {
	private String message;

	public InvalidAgeException() {
		super();
	}

	public InvalidAgeException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "InvalidAgeException [message=" + message + "]";
	}
	
}
