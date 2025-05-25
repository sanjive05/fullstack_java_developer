package multithreading;

public class QueueTest {

	public static void main(String[] args)  {
		BlockingQueue queue = new BlockingQueue(10);
		
		  System.out.println("Main method is starting...");
		
			Thread thread1 = new Thread(()->{
				int count = 0;
				
				while(count<=10) {
					
					System.out.println("Data added into the list :  "+queue.add(count++));
					
					
				}
			});
			Thread thread2 = new Thread(()->{
				int count = 0;
				
				while(count<=10) {
					System.out.println("Data added into the list :  "+queue.remove());
					count++;
				}
			});
			
			thread1.start();
			thread2.start();
			System.out.println(thread1.getState());
			  System.out.println("Main method is ending...");
	}
}
