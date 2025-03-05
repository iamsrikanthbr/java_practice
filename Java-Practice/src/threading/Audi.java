package threading;

public class Audi implements Runnable {

	@Override
	public void run() {
		for (int x = 0; x <= 9; x++) {
			System.out.println(x);
		}

	}

	public static void main(String[] args) {
		Audi audi = new Audi();
		Thread thread = new Thread(audi);
		thread.start();
	}

}
