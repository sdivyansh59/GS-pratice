package concept_practice;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		// Linked list implementation
		System.out.println("****** Linkedlist *******");
		List<Integer> linkedList1 = new LinkedList<Integer>();
		linkedList1.add(1);
		linkedList1.add(2);
		linkedList1.add(3);
		//linkedList1.addFirst(0); this is method of deque
		linkedList1.remove(0);//removing obj at index 0 (index based)
		linkedList1.remove((Integer)2);// removing object 2 (object based)
		System.out.println(linkedList1);
		
		
		/* Dequeue implementation  */
		System.out.println("****** Deque *******");
		Deque<Integer> deque1 = new LinkedList<Integer>();
		deque1.add(10);
		deque1.addFirst(9);
		deque1.addLast(11);
		System.out.println(deque1);
		deque1.removeFirst();
		deque1.removeLast();
		System.out.println(deque1);
		
		/* **** Queue ****** */
		System.out.println("****** Queue *******");
		Queue<Integer> queue1 = new LinkedList<Integer>();
		queue1.add(100);
		queue1.add(200);
		queue1.add(300);
		System.out.println(queue1);
		System.out.println("Peek of deque1 is: "+queue1.peek());
		System.out.println("remove element from deque "+ queue1.poll());
		System.out.println(queue1);
		
		
		
		
		
	}
	
}
