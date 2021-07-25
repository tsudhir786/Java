package collections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {

	public static void main(String[] args) {
//		Queue<String> pq = new PriorityQueue<>();
		Queue<String> pq = new PriorityQueue<>(Comparator.reverseOrder());
		pq.offer("D");
		pq.offer("C");
		pq.offer("B");
		pq.offer("A");

		for (int i = 0; i <= pq.size()+1; i++) {
			System.out.println(pq);
			System.out.println(pq.poll());;
			System.out.println(pq.peek());

		}
	}

}
