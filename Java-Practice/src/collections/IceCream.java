package collections;

import java.util.Stack;

public class IceCream {
	public static void main(String[] args) {
		Stack sc = new Stack();

		sc.push(100);
		sc.push(200);
		sc.push(500);
		sc.push(300);

		System.out.println(sc.peek());
		sc.pop();
		System.out.println(sc);
	}

}
