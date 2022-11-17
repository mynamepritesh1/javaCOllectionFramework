package Collection;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		
		//offer are used of add the element 
		queue.offer(12);
		queue.offer(13);
		queue.offer(14);
		
		
		System.out.println(queue);
		
		//for remove in queue  there are used poll and remove also used for remove the element
		
		System.out.println(queue.poll());
		System.out.println(queue.element());
		
		System.out.println(queue);
		
		//peek shows which element is next and element also used for same as peek
		System.out.println(queue.peek());
		System.out.println(queue.element());
		
		
		//add also used for addition
		queue.add(35);
		System.out.println(queue);
		
		

	}

}
