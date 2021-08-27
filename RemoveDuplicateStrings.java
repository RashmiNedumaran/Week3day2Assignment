package Week3Day2Assignments;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int data[] = {3,2,11,4,6,7,5,6,9,1,4,6,7,9,4};
		//Set<Integer>ArrayList1  = new TreeSet<Integer>();
		String text = "We learn java basics as part of java session in java week1";
		String[] splitarr = text.split(" ");
		Set<String>ArrayList1  = new LinkedHashSet<String>(Arrays.asList(splitarr));
		
		for(int i=0 ; i<splitarr.length ;i++) {
			ArrayList1.add(splitarr[i]);
		}
		System.out.println("The arraylist after removing duplicates :" + ArrayList1);
	}

}
