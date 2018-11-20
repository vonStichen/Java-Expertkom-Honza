package Lekce5;

public class MaximumFromList {

	public static void main(String[] args) {
	    findMin(new int[] {1,5,12,20,69,37});
	}
	public static void findMin(int[] array) {
	    if (array == null || array.length < 1)
	        return;
	    int max = array[0];

	    for (int i = 1; i <= array.length - 1; i++) {

	        if (max < array[i]) {
	            max = array[i];
	        }
	    }
	    System.out.println("max: " + max);
	}

}

