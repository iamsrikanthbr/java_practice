package program.exception;

public class Age {

	void checkingAge(int age) throws Exception {
		if (age < 18) {
			throw new Exception("You're denied must have age above Eighteen(18)");
		}
		System.out.println("Congrats you are eligible for vote ");
	}

	public static void main(String[] args) {
		Age age = new Age();
		try {
			age.checkingAge(26);
		} catch (Exception e) {
			System.out.println("Unknown error please verify");
		}

	}
}
