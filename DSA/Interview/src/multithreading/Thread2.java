package multithreading;

public class Thread2 implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.println("inside Thread2 : "+i+" "+Thread.currentThread());
		}
	}

	
}
