/**
 * 
 */
package javaBasic.Constructor;

/**
 * @author Sundaram
 * 
 */
class DefaultConstructorExample {
	int id;
	String name;
	
	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {
		DefaultConstructorExample s1 = new DefaultConstructorExample();
		DefaultConstructorExample s2 = new DefaultConstructorExample();
		s1.display();
		s2.display();
	}
}
