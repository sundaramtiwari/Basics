/**
 * 
 */
package javaBasic.Static;

/**
 * @author Sundaram
 * 
 */
// Program of changing the common property of all objects(static field).
public class StaticMethodExp {

	int rollno;
	String name;
	static String college = "ITS";

	static void change() {
		college = "BBDIT";
	}

	StaticMethodExp(int r, String n) {
		rollno = r;
		name = n;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + college);
	}

	public static void main(String args[]) {
		StaticMethodExp.change();

		StaticMethodExp s1 = new StaticMethodExp(111, "Karan");
		StaticMethodExp s2 = new StaticMethodExp(222, "Aryan");
		StaticMethodExp s3 = new StaticMethodExp(333, "Sonoo");

		s1.display();
		s2.display();
		s3.display();
	}
}
