/**
 * 
 */
package javaBasic.Constructor;

/**
 * @author Sundaram
 *
 */
public class CopyConstructorExample {  
    int id;  
    String name;  
    CopyConstructorExample(int i,String n){  
    id = i;  
    name = n;  
    }  
      
    CopyConstructorExample(CopyConstructorExample s){  
    id = s.id;  
    name =s.name;  
    }  
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
    	CopyConstructorExample s1 = new CopyConstructorExample(111,"Karan");  
    	CopyConstructorExample s2 = new CopyConstructorExample(s1);  
    	s1.display();  
    	s2.display();
    	
    	System.out.println("Does s1 equals s2: "+ s1.equals(s2));
    	
    	s1 = s2;
    	
    	System.out.println("Does s1 equals s2: "+ s1.equals(s2));
    	
    	System.out.println(s1.hashCode());
    	System.out.println(s2.hashCode());
   }  
}
