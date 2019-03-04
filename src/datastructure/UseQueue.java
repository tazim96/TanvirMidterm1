package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> q = new LinkedList<String>();


		q.add("New York");
		q.add("Dubai");
		q.add("London");
		q.add("Toronto");
		q.add("Miami");
		q.add("Los Angeles");
		System.out.println("Elements in Queue: "+q);


		q.remove();
		System.out.println("Queue after removing first element: "+q);


		System.out.println("After removing the first element, the head of the Queue now is: "+q.element());


		System.out.println("Also peek method returns the latest head of the Queue which is also: "+q.peek());

		q.add("Tokyo");
		System.out.println("The new Queue is: "+q);



		System.out.println("Use of for Each loop to retrieve data: ");
		for (String str1 : q) {
			System.out.print(str1+" ");
		} 
		System.out.println();


		System.out.println("Use of While loop to retrieve data: ");
		Iterator itr = q.iterator();
		while (itr.hasNext()) {
			String str2 = (String) itr.next();
			System.out.print(str2+" ");
		}
		System.out.println();

	}

}
