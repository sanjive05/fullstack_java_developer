package superclass;

class A{
	
	public void print() {
		System.out.println("In A class");
	}
	
	
}
public class SuperClasses  extends A{
	
	public  void print() {
		super.print();
	}
	

	public static void main(String[] args) {
	
		

	}

}
