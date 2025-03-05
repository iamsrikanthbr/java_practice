package collections;

import java.util.ArrayList;

public class ArrayLst {

	public static void main(String[] args) {

		ArrayList arr = new ArrayList();

		arr.add(80);
		arr.add(70);
		arr.add(40);
		arr.add(20);
		
		System.out.println(arr);
		arr.remove(2);
		System.out.println(arr);
		System.out.println(arr.size());
		arr.sort(null);
		System.out.println(arr);
	}

}
