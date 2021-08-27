package Week3Day2Assignments;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class SortingUsingCol {

	public static void main(String[] args) {
		String arr[] = {"AspireSystem","Wipro","Cts","Hcl"};
		List<String>strlist = new ArrayList <String>(Arrays.asList(arr));
		System.out.println("original array : " + strlist);
int arrlist = strlist.size();
System.out.println("Length of the string " +arrlist );
Collections.sort(strlist);
System.out.println("Sorted array " +strlist );

Collections.reverse(strlist);
System.out.println("reversed array " +strlist );
}}
