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
			if(q.size()==capacity) {
				return false;
			}
			capacity++;
			q.notifyAll();
			return q.add(item);
			
		}
	}
	
	public int remove() {
       synchronized(q) {
    	   if(q.size()==0) {
    		   try {
				q.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	   }
    	   capacity--;
			return q.poll();
		}
		
	}

}
