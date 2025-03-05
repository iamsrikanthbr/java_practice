package collections;

import java.util.LinkedHashSet;

public class LnkdHshSet {
	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		
		lhs.add("Java");
		lhs.add(99);
		lhs.add(" ");
		lhs.add("Program");
		lhs.add(90);
		lhs.add(200);
		lhs.add(" ");
		
		System.out.println(lhs);
		
	}

}
