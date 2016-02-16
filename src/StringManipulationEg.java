
public class StringManipulationEg {
 public static void main(String[] args){
	 
//	 A a = new B();
//	 a.create();
	 
	 StringBuilder s1 = new StringBuilder("defghi");
	 StringBuilder s2 = new StringBuilder("ghidef");
	 
	 int l1 = s1.length();
	 int l2=  s2.length();
	 int len = 0;
	 String sub = "";
	 
	 for(int i=0; i< l1; i++){
		 if(s2.indexOf(s1.charAt(i)+"") != -1){
			 int s2Index = s2.indexOf(s1.charAt(i)+"");
			 sub = s1.charAt(i)+"";
			 for(int j=i+1; j<=l1; j++){
				 if((j<=l1) && (s2Index+(j-i)<=l2) && (s1.substring(i, j).equals(s2.substring(s2Index, (s2Index+(j-i)))))){
					 sub = s1.substring(i, j);
				 }
				 else
					 break;
			 }
		 }
		 System.out.println(sub);
	 }
	 
 } 
}

class A{
	public void create(){
		System.out.println("Class A create method");
	}
}

class B extends A{
	public void create(){
		System.out.println("Class B create method");
	}
}