package javaBasic.Static;

public class StaticVarCounterExp {
	static int count = 0;// will get memory only once and retain its value

	StaticVarCounterExp() {
		count++;
		System.out.println(count);
	}

	public static void main(String args[]) {

		StaticVarCounterExp c1 = new StaticVarCounterExp();
		StaticVarCounterExp c2 = new StaticVarCounterExp();
		StaticVarCounterExp c3 = new StaticVarCounterExp();

	}
}
