package collections;

import java.util.Stack;

//LIFO
public class LearnStack {

	public static void main(String[] args) {

		Stack<String> animals = new Stack<>();
		animals.push("Lion");
		animals.push("Cat");
		animals.push("Horse");
		animals.push("Donkey");
		System.out.println("Stack " + animals);
		
		System.out.println(animals.peek());
		animals.pop();
		System.out.println(animals.peek());
		
		for (String name : animals) {
			System.out.println("Stack animals :"+ name);
			
		}
		
	}
}
