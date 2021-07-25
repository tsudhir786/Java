package collections;

import java.util.LinkedList;
import java.util.Queue;

//FIFO
public class LearnLinkedListQueue {

	public static void main(String[] args) {

		Queue<String> queue = new LinkedList<>();

		queue.offer("Hyderabad");
		queue.offer("Vijayawada");
		queue.offer("Chennai");

		queue.poll();
		for (int i = 0; i <= queue.size() + 1; i++) {
			System.out.println(queue);
			System.out.println(queue.peek());

			for (int j = i; j < queue.size() + 1; j++) {
				queue.poll();
				System.out.println(queue);
				System.out.println(queue.peek());

			}
		}

	}

}
