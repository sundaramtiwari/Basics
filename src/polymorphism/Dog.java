/**
 * 
 */
package polymorphism;

/**
 * @author Sundaram
 *
 */
public class Dog extends Animal {

	/**
	 * 
	 */
	public Dog() {
		// TODO Auto-generated constructor stub
		super();
		
		setSound("bark");
	}
	
	public void digHole(){
		System.out.println("Dug a hole");
	}
	
	private void accessPrivate(){
		System.out.println("private dog method");
	}
	
	public void accessPublic(){
		accessPrivate();
	}
}
