package Collection;

import java.util.HashSet;
import java.util.Set;

public class HashSett {

	public static void main(String[] args) {
		
		//In set duplicate element does not allow 
		//in set order does not defined
		
		Set<Integer> set = new HashSet<>();
		
		set.add(45);
		set.add(23);
		set.add(23);
		set.add(24);
		set.add(25);
		set.add(27);
		set.add(2);
		
		System.out.println(set);
		
		//remove
		
		set.remove(23);
		
		System.out.println(set);
		
		System.out.println(set.contains(23));
		
		
		System.out.println(set.isEmpty());
		
		System.out.println(set.size());
		
		
		set.clear();
//       System.out.println(set);		
	}

}
