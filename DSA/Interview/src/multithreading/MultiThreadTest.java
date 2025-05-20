package multithreading;

public class MultiThreadTest {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main is starting...");
		
		Thread thread2 = new Thread(new Thread2(),"thread 2");
		
		
		thread2.start();
		
		
		/*
		Thread1 thread1 = new Thread1("daemon Thread");
		thread1.setDaemon(true);
		
		thread1.start();
		System.out.println(thread1.getName());
		
		*/
		System.out.println("Main is ending...");
	}
	

}
