package multithreading;

public class SingletonClassMultithreading {
	private static SingletonClassMultithreading singleTonClassMultithreading;
	
	private SingletonClassMultithreading() {
		System.out.println("Object created");
	}
	
	public static SingletonClassMultithreading getObject() {
		if(singleTonClassMultithreading == null) {
			
		      singleTonClassMultithreading = new SingletonClassMultithreading();
		}
		return singleTonClassMultithreading;
	}
	
	public void print() {
		System.out.println("This is Singleton Class...");
	}

}
