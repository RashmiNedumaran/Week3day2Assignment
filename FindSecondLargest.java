package Week3Day2Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		int data[] = {3,2,11,4,6,7};
		/*Arrays.sort(data);
		System.out.println("The second largest numbers :" + data[data.length -2]);*/
		List<Integer>ArrayList1  = new ArrayList<Integer>();
		for(int i=0 ; i<data.length ;i++) {
			ArrayList1.add(data[i]);
		}
		System.out.println("The arraylist contains :" + ArrayList1);
		Collections.sort(ArrayList1);
		System.out.println("The arraylist After sorting :" + ArrayList1);
		 int value = ArrayList1.size();
		System.out.println("The Second largest number is :" + ArrayList1.get(value-2));
	}

}
