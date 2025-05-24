package multithreading;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue {
	
	private Queue<Integer> q;
	private int capacity;
	
	public BlockingQueue(int capacity) {
		q= new LinkedList<Integer>();
		this.capacity = capacity;
	}
	
	public boolean add(int item) {
		synchronized(q) {
			capacity++;
			return q.add(item);
			
		}
	}
	
	public int remove() {
       synchronized(q) {
    	   capacity--;
			return q.poll();
		}
		
	}

}
