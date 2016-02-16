package javaBasic.This;

public class ThisUsedForCurrentClassVar {
	// example of this keyword
	int id;
	String name;

	ThisUsedForCurrentClassVar(int id, String name) {
		this.id = id;
		this.name = name;
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {
		ThisUsedForCurrentClassVar s1 = new ThisUsedForCurrentClassVar(111,
				"Karan");
		ThisUsedForCurrentClassVar s2 = new ThisUsedForCurrentClassVar(222,
				"Aryan");
		s1.display();
		s2.display();
	}
}
