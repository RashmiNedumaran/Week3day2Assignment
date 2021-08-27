package Week3Day2Assignments;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data[] = {3,2,11,4,6,7,5,6,9,1,4,6,7,9,4};
		//Set<Integer>ArrayList1  = new TreeSet<Integer>();
		Set<Integer>ArrayList1  = new LinkedHashSet<Integer>();
		for(int i=0 ; i<data.length ;i++) {
			ArrayList1.add(data[i]);
		}
		System.out.println("The arraylist after removing duplicates :" + ArrayList1);
	}

}
