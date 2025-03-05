package collections;

import java.util.HashMap;

public class MapHash {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(1, "Srikanth");
		hm.put(2, "cricket");
		hm.put(3, "CWC");
		hm.put(4, "BGT");
		hm.put(2, "T20WC");

		System.out.println(hm);
	}

}
