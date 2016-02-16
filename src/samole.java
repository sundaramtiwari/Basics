
public class samole {

	public static void main(String[] args) {
		//String str1 = "ABACD";
		//String str2 = "CDABA";
		
		String str1 = "ABACD";
		String str2 = "BACDA";
		
		Calculate(str1, str2);

	}

	private static void Calculate(String str1, String str2) {
		// TODO Auto-generated method stub
		String[] str1arr = str1.split("");
		String[] str2arr = str2.split("");
		
		int r = rotateRight(str1arr, str2arr);
		int l = rotateLeft(str1arr, str2arr);
		
		if(r>l)
			System.out.println(l);
		else
			System.out.println(r);
	}

	private static int rotateLeft(String[] str1arr, String[] str2arr) {
		// TODO Auto-generated method stub
		int length = str1arr.length;

		for (int i = 0; i <= length-1; i++) {
			if (str1arr[i+1].equalsIgnoreCase(str2arr[1]))
				return i-1;
		}

		return -1;
	}

	private static int rotateRight(String[] str1arr, String[] str2arr) {
		int length1 = str1arr.length;

		for (int i = length1-1; i >= 1; i--) {
			if (str1arr[i].equalsIgnoreCase(str2arr[1]))
				return i-1;
		}

		return -1;
	}
}