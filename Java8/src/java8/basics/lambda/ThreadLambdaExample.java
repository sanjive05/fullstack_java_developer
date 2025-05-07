package java8.basics.lambda;

public class ThreadLambdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Before java 8 
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Thread 3");
				
			}
			
		}).start();
		
		new Thread(()->System.out.println("Hello 300")).start(); 

	}

}
