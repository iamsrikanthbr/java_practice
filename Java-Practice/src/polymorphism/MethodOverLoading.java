package polymorphism;
public class MethodOverLoading {

	void multiplication(int a, int b) {

		int mul = a * b;
		System.out.println("Multiplication of two numbers : "+mul);

	}

	void multiplication(int a, int b, int c) {

		int mul = a * b * c;
		System.out.println("Multiplication of three numbers :"+mul);

	}

	void multiplication(int a, int b, int c, int d) {

		int mul = a * b * c * d;
		System.out.println("Multiplication of four numbers :"+mul);

	}

	public static void main(String[] args) {

		MethodOverLoading meth = new MethodOverLoading();
		meth.multiplication(1, 5);
		meth.multiplication(1, 2, 3);
		meth.multiplication(2, 5, 2, 25);
	}
}
