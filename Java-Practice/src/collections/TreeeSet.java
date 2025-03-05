package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeeSet {
	public static void main(String[] args) {

		TreeSet ts = new TreeSet();

		ts.add(20);
		ts.add(10);
		ts.add(1);
		ts.add(20);
		ts.add(55);
		ts.add(8);

		System.out.println(ts);

		Iterator<Integer> it = ts.iterator();
		while (it.hasNext()) {
			System.out.println(it.next() + " ");
		}

	}

}
