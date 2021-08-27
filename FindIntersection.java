package Week3Day2Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*arr1 = {3,2,11,4,6,7};
 * arr2 = {1,2,8,4,9,7};
 * for loop 0 to array length
 * nested for loop for another array
 * compare both array using condition statement
 * print the first array (should match item in both array)  
		int arr1[] = {3,2,11,4,6,7};
		int arr2[] = {1,2,8,4,9,7};
		for (int i = 0; i <=arr1.length-1 ; i++) {
			for (int j = 0; j <=arr2.length-1 ; j++) {
				if(arr1[i] == arr2[j]) {
					System.out.println(arr1[i]);
				}
			}
		}
	}
}*/
		int arr1[] = {3,2,11,4,6,7};
		int arr2[] = {1,2,8,4,9,7};
		List<Integer>ArrayList1  = new ArrayList<Integer>();
		List<Integer>ArrayList2 = new ArrayList<Integer>();
		for(int i = 0; i<arr1.length; i++) {
			ArrayList1.add(arr1[i]);
			ArrayList2.add(arr2[i]);
		}
		System.out.println("First Array: " +ArrayList1);
		System.out.println("Second Array: " +ArrayList2);
		ArrayList1.retainAll(ArrayList2);
		System.out.println("Intersection values are : "+ArrayList1);
}}