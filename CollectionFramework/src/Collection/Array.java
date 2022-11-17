
package Collection;

import java.util.*;



public class Array {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(11);
        list.add(12);

        System.out.println(list);

        list.remove(1);
        System.out.println(list);
        
        // creating new list 
        List<Integer> newList = new ArrayList<>();
        list.add(23);
        list.add(24);
        
        list.addAll(newList); // this will add the all the element
        
        System.out.println(list);
        
        
        System.out.println(list.get(1));
        
        //remove method in ArrayList position
        list.remove(1);
        System.out.println(list);
        
        //if we want to remove particular element 
        
        list.remove(Integer.valueOf(24));
        System.out.println(list);
        
        // arrayList we have getting o(n) time complexity
        
        //set function in ArrayList
        
        //set function are used for update any value in ArrayList
        //set function are work in o(1) its directly goes to that position
        
        list.set(0, 9);
        System.out.println(list);
        
        //contains are work for the value are present in that particular position 
         System.out.println(list.contains(10));
         
         
         //for each in ArrayList best and easy way
         for(Integer element : list) {
         System.out.println("Element are : " + element);
        
         }
        //for loop 
         for( int i=0; i<list.size(); i++) {
             System.out.println("Element is : " + list.get(i));
            
             }
            
        

    }
}
