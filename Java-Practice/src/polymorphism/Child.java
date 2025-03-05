package polymorphism;

public class Child extends Parent {

	void m1() {
		System.out.println(" Child class Implementation");
	}

	public static void main(String[] args) {

		Child child = new Child();
		child.m1();
	}

}
