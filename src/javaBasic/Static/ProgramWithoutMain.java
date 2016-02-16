package javaBasic.Static;

// We can execute a program without main() method by static block but in previous versions of JDK 1.7
public class ProgramWithoutMain {
	static {
		System.out.println("static block is invoked");
		System.exit(0);
	}
}
