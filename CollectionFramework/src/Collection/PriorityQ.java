package Collection;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQ {

	public static void main(String[] args) {
		
		//comparator.reverseOrder are used for reverse order 
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		 pq.offer(6);
		pq.offer(1);
		pq.offer(2);
		pq.offer(3);
		
		System.out.println(pq);
		
		System.out.println(pq.poll());
		
		System.out.println(pq);
		
		//all function is mostly same as queue
		
		

	}

}
