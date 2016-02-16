/**
 * 
 */

/**
 * @author Sundaram
 *
 */
public class ArraySumEg {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,7,3,4,5,6,2};
		
		printAllSumCombos(array, 7);
	}

	private static void printAllSumCombos(int[] array, int target) {
		
		int size = array.length;
		for(int i=0; i<size; i++){
			if(array[i] == target)
				System.out.println(i);
			else if(array[i] > target)
				break;
			else {
				for(int j=0; j<size; j++){
					if(i==j)
						break;
					else {
						
					}
				}
			}
		}
		
	}

}
