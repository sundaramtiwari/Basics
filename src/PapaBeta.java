/**
 * 
 */

/**
 * @author Sundaram
 * 
 */
public class PapaBeta {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Papa p = new Beta();
		// p.method();
		((Beta) p).methodTwo();
		p.methodTw();
		p.a();
	}
}

class Papa {
	void methodTw() {
		System.out.println("papa method");
	}
	void a(){
		System.out.println("papa method");
	}
}

class Beta extends Papa {
	void methodTwo() {
		System.out.println("asdf");
	}
	void a(){
		System.out.println("Beta method");
	}
}

abstract class myAbstract {
	public void getName() {
		System.out.println("asdf");
	}
}