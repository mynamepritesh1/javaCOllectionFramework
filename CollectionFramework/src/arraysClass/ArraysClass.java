package arraysClass;

import java.util.Arrays;

public class ArraysClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		//binarySerach is used of which element are present in particular index 
		 int [] numbers = {1,2,3,4,5,45,56,6,7,7,9};
		 int index = Arrays.binarySearch(numbers, 5);
		 
		 System.out.println("The index of element 5 in array is " + index);
		 
		 
		 //for sorting 
		 Arrays.sort(numbers);
		 for(int i : numbers) {
			 System.out.println(i + " ");
		 }
		 
		 
	}

}
