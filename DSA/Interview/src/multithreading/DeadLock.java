package multithreading;

public class DeadLock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Sanjive";
		String s2 = "Subramaniam";
		
		Thread thread1 = new Thread(()->{
			synchronized(s1) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized(s2) {
						System.out.println("lock accquired s2");
					}
			
			}
		});
		Thread thread2 = new Thread(()->{
			synchronized(s2) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized(s1) {
						System.out.println("lock accquired s2");
					}
			
			}
		});
		thread1.start();
		thread2.start();

	}

}
