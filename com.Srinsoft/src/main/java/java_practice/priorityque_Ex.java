package java_practice;

import java.util.Iterator;
import java.util.PriorityQueue;

public class priorityque_Ex {

	public static void main(String[] args) {
PriorityQueue<String> pq=new PriorityQueue<String>();
pq.add("amw");
pq.add("bjhb");
pq.add("edfh");
pq.add("njit");
pq.add("cucati");
pq.add("doyota");
//pq.poll();

//System.out.println(pq.element());
Iterator itr=pq.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}
	}

}
