package collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class LearArrayDeque {

	public static void main(String[] args) {
		ArrayDeque<Integer> adq = new ArrayDeque<>();
//		Can implement Queue and stack also 
//		Queue<Integer> aq = new ArrayDeque<>();
		adq.offer(100);
		adq.offerFirst(101);
		adq.offerLast(99);
		adq.offer(200);
		adq.offerLast(1);
		
		System.out.println(adq);
		System.out.println(adq.peekFirst());
		System.out.println(adq.peekLast());
		
		System.out.println(adq.poll());
		
		adq.pollFirst();
		adq.pollLast();
		System.out.println(adq);
		
	}

}
