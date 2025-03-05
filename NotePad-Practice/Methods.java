public class Methods {
	public static void main(String[] args) {
		Methods met = new Methods();
		System.out.println(met.m1(20, 30));
		System.out.println(met.m2());
		met.marks(50, 90);
		met.m4();
	}

	int m1(int a, int b) {
		int result = a + b;
		return result;
	}

	String m2() {
		String name = "Srikanth";
		String sname = " Bommareddy";
		String Fullname = name + sname;
		return Fullname;
	}

	void marks(int maths, int chemistry) {
		int average = (maths + chemistry) / 2;
		System.out.println(average);
	}

	void m4() {

		System.out.println("Java");
	}
}