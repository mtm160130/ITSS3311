/* Test Run
 * Enter 5 elements of list1: 
1
2
3
4
5
Enter 5 elements of list2: 
1
2
3
4
5
The two lists are strictly identical

Link to Repository: https://github.com/mtm160130/ITSS3311
 */
import java.util.Scanner;

public class StrictlyIdentical {
	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
	        System.out.println("Enter 5 elements of list1: ");
	        
	        int[] array1 = new int[5]; // create array1 with space for 5 integers
	        for (int i = 0; i < array1.length; i++) { 
	        	array1[i] = input.nextInt(); // saves each input to array
	        }
	        
	        System.out.println("Enter 5 elements of list2: ");

	        int[] array2 = new int[5]; // create array2 with space for 5 integers
	        for (int i = 0; i < array2.length; i++) {
	        	array2[i] = input.nextInt(); // saves each input to array
	        }
	        
	        if (equals(array1, array2)) // calls equals method
	        {
	            System.out.println("The two lists are strictly identical");
	       	} 
	        else {
	            System.out.println("The two lists are not strictly identical");
	        }



	    }

	   public static boolean equals(int[] array1, int[] array2) {

	       if (array1.length != array2.length) return false;//checks if array1 and array2 are the same length


	       for (int i = 0; i < array1.length; i++) {
	           if (array1[i] != array2[i]) return false;// checks each index of array1 and array2 to see if they are identical
	        }

	       return true; //returns true if array1 and array2 are identical
	    }
		
		
		
		
		
		
}
