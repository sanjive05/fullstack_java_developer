package oopsinterviewquestions;

interface A{
	default  void print() {
		System.out.println("Inside A");
	}
}
interface B{
	default  void print() {
		System.out.println("Inside B");
	}
	
}
public class DefaultMethodInClass implements A,B {

	public static void main(String[] args) {
		
	}

	@Override
	public void print() {
		A.super.print();
	}

}
