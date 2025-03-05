public class Method {
	public static void main(String[] args) {
		Method met = new Method();
		Raju r1 = new Raju();
		Rani r2 = new Rani();
		met.meth(r1, r2);
	}

	void meth(Raju r1, Rani r2) {
		r1.name = "Raju";
		r1.age = 30;
		System.out.println(r1.name);
		System.out.println(r1.age);
		r2.age = 26;
		r2.name = "Rani";
		System.out.println(r2.name);
		System.out.println(r2.age);
	}
}

class Raju {
	int age;
	String name;
}

class Rani {
	int age;
	String name;
}