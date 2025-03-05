package program.exception;

public class LoginForm {

	void checkingCredentials(int id) throws InvalidCredentials {
		if (id == 1234) {
			throw new InvalidCredentials("Login Sucessful");

		}
		System.out.println("Please enter valid credentials");
	}

	public static void main(String[] args) {

		LoginForm loginForm = new LoginForm();
		try {
			loginForm.checkingCredentials(1234);
		} catch (InvalidCredentials e) {
			e.printStackTrace();
		}
	}
}
