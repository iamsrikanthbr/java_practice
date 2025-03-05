package program.exception;

public class ArithematicExceptionDemo {

	public static void main(String[] args) {

		System.out.println("Start");
		int a = 10;
		int b = 0;

		try {

			int result = a / b;

		} catch (Exception e) {
			System.out.println("Arithematic Exception occured. Please Verify !!!!");
		}
		
		finally
		{
			System.out.println("Code comming from finally Block");
		}

		System.out.println("End");
	}

}
