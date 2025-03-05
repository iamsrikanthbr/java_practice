package threading;

public class Demo {

	public static void main(String[] args) {

		Thread currentThread = new Thread();
//		currentThread.setName("BMW");
//		currentThread.setPriority(9);
		System.out.println(currentThread.getName());
		System.out.println(currentThread.getPriority());
		System.out.println(currentThread.getThreadGroup());

	}
}
