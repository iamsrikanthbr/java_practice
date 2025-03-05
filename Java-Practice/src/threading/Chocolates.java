package threading;

public class Chocolates implements Runnable {

	synchronized void bookingTickets() {
		for (int chocolates = 0; chocolates <= 3; chocolates++) {
			try {
				Thread.sleep(4000);
				System.out.println(Thread.currentThread().getName() + chocolates);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void run() {
		bookingTickets();
	}

	public static void main(String[] args) {
		Chocolates chocolates = new Chocolates();

		Thread t1 = new Thread(chocolates);
		t1.start();
		t1.setPriority(Thread.NORM_PRIORITY);
		t1.setName("Mahesh");

		Thread t2 = new Thread(chocolates);
		t2.start();
		t2.setPriority(Thread.MIN_PRIORITY);
		t2.setName("Babu");

		Thread t3 = new Thread(chocolates);
		t3.start();
		t3.setPriority(Thread.MAX_PRIORITY);
		t3.setName("Bhuvaneswar");

	}

}
