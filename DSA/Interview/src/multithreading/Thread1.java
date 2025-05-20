package multithreading;

public class Thread1 extends Thread{
	
	public Thread1(String string) {
		// TODO Auto-generated constructor stub
		super(string);
	}

	@Override
	public void run() {
		for(int i=0;i<100000;i++) {
			System.out.println("inside Thread1 : "+i+"  thread :"+Thread.currentThread());
		}
	}

}
