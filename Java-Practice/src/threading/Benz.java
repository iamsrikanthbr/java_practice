package threading;

public class Benz extends Thread {

	public void run() {
		System.out.println("UserDefined Thread with Thread class");
	}

	public static void main(String[] args) {

		Benz benz = new Benz();
		Thread thread = new Thread(benz);
		thread.start();
	}

}
