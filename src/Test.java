
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str1 = "ABACD";
		String str2 = "CDABA";
		
		String str1 = "ABACD";
		String str21 = "BACDA";
		
		
		System.out.println(isRotation(str1, str21));
		boolean flag = isRotation(str1, str21);
		
		if(flag){
			System.out.println(Calculate(str1, str21));
			
		}
		
		
	}

	private static int Calculate(String str1, String str2) {
		// TODO Auto-generated method stub
		
		char[] s1 = str1.toCharArray();
		char[] s2 = str2.toCharArray();
		
		int rightrotation=0;
		int leftrotation=0;
		
		for(int i=s1.length-1; i>=0;i--){
			if(s2[0] == s1[i]){
				rightrotation =s1.length-i;
				break;
			}
		}
		
		for(int i=0;i<s1.length; i++){
			if(s2[0] == s1[i]){
				leftrotation = i;
				break;
			}
		}
		
		if(rightrotation > leftrotation)
			return leftrotation;
		else
			return rightrotation;
		
	}
	
	static boolean isRotation(String s1,String s2) {
	    return (s1.length() == s2.length()) && ((s1+s1).indexOf(s2) != -1);
	}


}
