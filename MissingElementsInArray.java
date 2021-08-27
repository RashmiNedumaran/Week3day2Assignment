package Week3Day2Assignments;

import java.util.ArrayList;
import java.util.List;

public class MissingElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data[] = {0,1,2,3,5,6,7,8,9};
		List<Integer>listarray1 = new ArrayList<Integer>();
		for(int i=0;i<data.length;i++) {
			listarray1.add(data[i]);	
			}
		int length = listarray1.size();
		for(int i=0 ;i<length ; i++) {
			if(i!=listarray1.get(i)) {
				System.out.println("The missing elements are : "+i );
				break;
			}
		
		}
	
	}

}
