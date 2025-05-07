package java8.basics.lambda;

public class RunnableLambdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// before java 8 
		Runnable t1 = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Thread -1");	
			}	
		};
		new Thread(t1).run();
		
		// After java 8 
		
		Runnable t2 = ()-> System.out.println("Hello t2");
		
		new Thread(t2).run(); 
	}

}
