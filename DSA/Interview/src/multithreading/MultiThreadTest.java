package multithreading;

public class MultiThreadTest {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main is starting...");
		
		//Thread thread2 = new Thread(new Thread2(),"thread 2");
		Thread thread3 = new Thread(()->{
			for(int i=0;i<1000;i++) {
				System.out.println(" "+i+"  "+Thread.currentThread());
			}
		}," Thread 3");
		thread3.setDaemon(true);

		//thread3.start();

		//thread2.start();
		
		
		/*
		Thread1 thread1 = new Thread1("daemon Thread");
		thread1.setDaemon(true);
		
		thread1.start();
		System.out.println(thread1.getName());
		
		*/
		Thread thread1 = new Thread(()->{
			SingletonClassMultithreading obj = SingletonClassMultithreading.getObject();
			obj.print();
			System.out.println(Thread.currentThread()  +"   "+ System.identityHashCode(obj));
		},"Thread 1");
		
		
		Thread thread2 = new Thread(()->{
			SingletonClassMultithreading obj = SingletonClassMultithreading.getObject();
			obj.print();
			System.out.println(Thread.currentThread()  +"   "+ System.identityHashCode(obj));
		},"Thread 2");
		
		
		thread1.start();
		thread2.start();
		
		
		
		System.out.println("Main is ending...");
		
	}
	

}
