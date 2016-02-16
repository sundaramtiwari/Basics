/**
 * 
 */
package polymorphism;

/**
 * @author Sundaram
 *
 */
public class WorkWithAnimals {

	/**
	 * @param args
	 */
	
	int justANum =10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog fido = new Dog();
		
		fido.setName("fido");
		System.out.println(fido.getName());
		
		Animal doggy = new Dog();
		Animal kitty = new Cat();
		
		System.out.println("Doggy says: "+doggy.getSound());
		System.out.println("kitty says: "+kitty.getSound());
		
		Animal[] animals = new Animal [4];
		animals[0] = doggy;
		animals[1] = kitty;
		System.out.println("animals[0] says: "+animals[0].getSound());
		System.out.println("animals[1] says: "+animals[1].getSound());
		
		speakAnimal(doggy);
		
		((Dog) doggy).digHole();
		
		//System.out.println(justANum);
		
		//sayHello();
		
		fido.accessPublic();
		
	}
	
	public static void speakAnimal(Animal randAnimal){
		System.out.println("Animal says: "+ randAnimal.getSound());
	}
	
	public void sayHello(){
		System.out.println("Hello");
	}
}
