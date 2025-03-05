package inheritance;

public class Child extends Parent {

	void m2() {
		System.out.println("m2 comming from child class");
	}

	public static void main(String[] args) {

		Child child = new Child();

		child.m1();
		child.m2();
	}

}
