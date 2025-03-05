package threading;

public class UserDefinedThreads implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i <= 5; i++) {
			try {
				Thread.sleep(4000);
				System.out.println(i);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		UserDefinedThreads userDefinedThreads = new UserDefinedThreads();
		Thread thread = new Thread(userDefinedThreads);

		thread.start();
	}

}
