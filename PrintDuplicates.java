package Week3Day2Assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data[] = {3,2,11,4,6,7,5,6,9,1,4,6,7,9,4};
		Set<Integer>ArrayList1  = new LinkedHashSet<Integer>();
		Set<Integer>DupArrayList  = new LinkedHashSet<Integer>();
for(int i : data) {
if(ArrayList1.add(i)==false) {
	DupArrayList.add(i);
}
	}
System.out.println("The Duplicated values are : " + DupArrayList);
}}
