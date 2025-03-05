public class Sample {

	public static void main(String[] args) {
		Sample sample = new Sample();
		sample.printDetails();
	}

	HelloWorld printDetails() {
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.name = "Srikanth";
		helloWorld.age = 26;
		System.out.println(helloWorld.name);
		System.out.println(helloWorld.age);
		return helloWorld;
	}
}

class HelloWorld {

	String name;
	int age;

}
