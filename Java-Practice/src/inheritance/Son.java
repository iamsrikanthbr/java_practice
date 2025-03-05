package inheritance;

public class Son extends Father {

	void apartment() {
		System.out.println("he has 20 Apartments");
	}

	public static void main(String[] args) {

		Son son = new Son();

		son.land();
//		son.plot();
//		son.apartment();
	}

}


// Hierarchial Inheritance