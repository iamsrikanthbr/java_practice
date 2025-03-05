import java.io.*;

public class Raaju implements Serializable {

	int age;
	String name;

	public static void main(String[] args) throws Exception {
		
		System.out.println("Deserialization Started");
		FileInputStream fis = new FileInputStream("text.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object object = ois.readObject();
		Raaju r = (Raaju) object;

		System.out.println(r.age);
		System.out.println(r.name);
		ois.close();
		System.out.println("Deserialization Ended");
	}
}