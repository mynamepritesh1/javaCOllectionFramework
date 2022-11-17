package Collection;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.HashSet;
import java.util.List;
//import java.util.LinkedHashSet;
//import java.util.Set;
//import java.util.TreeSet;

public class LinkedListHashSett {

	public static void main(String[] args) {
//    Set<Integer> set = new LinkedHashSet<>();
		
//		Set<Student> studentSet = new HashSet<>();
		List<Student> studentSet = new ArrayList<>();
//		
//		set.add(45);
//		set.add(23);
//		set.add(23);
//		set.add(24);
//		set.add(25);
//		set.add(27);
//		set.add(2);
//		
//		System.out.println(set);
//		
		
		studentSet.add(new Student("anuj" ,2));
		studentSet.add(new Student("priyanka" ,3));
		studentSet.add(new Student("pritesh" ,5));
		studentSet.add(new Student("sachin" ,1));
		
		studentSet.add(new Student("rohit" , 2));
		
		
		//sort with comparable only take integer(one way sorting)
//		Collections.sort(studentSet);
//		System.out.println("Sorted " + studentSet);
		
		
		//Sorting with comparator it takes both integer and string as well
		Collections.sort(studentSet, Student.NameComparator);
		System.out.println(studentSet);

		
		
		
	}

}
