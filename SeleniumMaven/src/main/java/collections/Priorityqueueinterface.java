package collections;

import java.util.PriorityQueue;

public class Priorityqueueinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PriorityQueue pq = new PriorityQueue();
pq.add("Hi");
pq.add("A");
pq.add("Hello");
pq.add("Hello");
pq.add("How are you");
pq.add("B");
System.out.println(pq);
System.out.println(pq.poll());//gets the top value and deletes from memory
System.out.println(pq.peek());
System.out.println(pq.peek());
	}

}
