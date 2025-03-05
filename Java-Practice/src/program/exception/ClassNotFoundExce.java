package program.exception;

public class ClassNotFoundExce {

	public static void main(String[] args) {

		try {
			Class.forName("com.example.NonExistentClass");
		} 
		catch (Exception e) {
			System.out.println("ClassNotFoundException Occured: ");
			e.printStackTrace();
		}
	}

}
