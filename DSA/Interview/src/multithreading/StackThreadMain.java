package multithreading;

public class StackThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main is starting....");
		Stack stack = new Stack(5);
		new Thread(()->{
			int counter =0;
			
			while(++counter <10) {
				System.out.println("Pushed  : "+stack.push(100));
			}
		},"Pusher ").start();;
		new Thread(()->{
			int counter =0;
			
			while(++counter <10) {
				System.out.println("Poped  : "+stack.pop());
			}
		},"Poper ").start();;
		
		System.out.println("Main is Ending...");
	}

}
