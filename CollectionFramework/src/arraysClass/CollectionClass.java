package arraysClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionClass {

	public static void main(String[] args) {
		
		//all function are present in collection class that are used in collection framework but 
		//there is additional function also that e can used in collection class
		
		List<Integer> list = new ArrayList<>();
		
		list.add(23);
		list.add(21);
		list.add(56);
		list.add(45);
		list.add(27);
		list.add(9);
		list.add(11);
		list.add(9);
		list.add(9);
		
		
		//if i want to check which is smallest element in given array 
		
		System.out.println("Min element is " + Collections.min(list));
		System.out.println("Max element is " + Collections.max(list));
		System.out.println(Collections.frequency(list, 9));
		
//		System.out.println(Collections.sort(list));
		Collections.sort(list);
		System.out.println(list);
		
		Collections.sort(list, Comparator.reverseOrder());
		System.out.println(list);
		
		 
		

	}

}
