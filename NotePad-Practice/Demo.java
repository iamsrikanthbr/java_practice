public class Demo {

	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.printDetails();

	}

	Object[] printDetails() {
		Hello hello = new Hello();
		hello.name = "Srikanth";
		hello.age = 26;
		System.out.println(hello.name);
		System.out.println(hello.age);

		MyClass myClass = new MyClass();
		myClass.name = "Kumar";
		myClass.age = 30;
		System.out.println(myClass.name);
		System.out.println(myClass.age);
		Object[] arr = { hello, myClass };
		return arr;
	}
}

class Hello {

	String name;
	int age;
}

class MyClass {

	String name;
	int age;

}