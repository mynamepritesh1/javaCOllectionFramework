package Collection;

import java.util.ArrayDeque;

public class ArrayDq {

	public static void main(String[] args) {
		
		//in this ArrayDeque we can add or remove element from both side
		//mostly  used in sliding window 
		
		//mostly used of queue function in ArrayDeque
		//and other function also that we can used in ArrayDeque
		
		ArrayDeque<Integer> adq = new ArrayDeque<>();
		
		adq.offer(34);
		adq.offerFirst(45);
		adq.offerLast(56);
		adq.offer(44);
		
		System.out.println(adq);
		
		System.out.println();
		
		//peek are used for next element
		//adq.peek();
		System.out.println(adq.peek());
		System.out.println(adq.peekFirst());
		System.out.println(adq.peekLast());
		System.out.println(adq);
		
		System.out.println();
		
		//poll are used for remove
		//adq.poll();
		System.out.println(adq.poll());
		System.out.println(adq.pollFirst());
		System.out.println(adq.pollLast());
		System.out.println(adq);
		
		System.out.println();
		
		
		
		
		
		

	}

}
