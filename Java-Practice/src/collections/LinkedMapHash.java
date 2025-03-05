package collections;

import java.util.LinkedHashMap;

public class LinkedMapHash {
	
	public static void main(String[] args) {
		LinkedHashMap hm = new LinkedHashMap();
		hm.put(100, "Srikanth");
		hm.put(44, "cricket");
		hm.put(3, "CWC");
		hm.put(5, "BGT");
		hm.put(2, "T20WC");

		System.out.println(hm);
	}

}
