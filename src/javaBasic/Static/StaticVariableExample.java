/**
 * 
 */
package javaBasic.Static;

/**
 * @author Sundaram
 * 
 */
public class StaticVariableExample {
	int rollno;
	String name;
	static String college = "ITS";

	StaticVariableExample(int r, String n) {
		rollno = r;
		name = n;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + college);
	}

	public static void main(String args[]) {
		StaticVariableExample s1 = new StaticVariableExample(111, "Karan");
		StaticVariableExample s2 = new StaticVariableExample(222, "Aryan");

		s1.display();
		s2.display();
	}
}
