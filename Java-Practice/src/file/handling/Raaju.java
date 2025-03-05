package file.handling;

import java.io.*;

public class Raaju implements Serializable {

	private static final long serialVersionUID = -5230125665250922576L;
	int age;
	String name;

	public static void main(String[] args) throws Exception {
		Raaju raju = new Raaju();
		raju.age = 26;
		raju.name = "Srikanth";
		System.out.println("Serialization Started");
		FileOutputStream fos = new FileOutputStream("text.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(raju);
		oos.flush();
		oos.close();

		System.out.println("Serialization Ended");

	}
}