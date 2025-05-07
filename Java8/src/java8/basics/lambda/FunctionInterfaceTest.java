package java8.basics.lambda;

@FunctionalInterface
interface Interface1{
	void add(int a,int b);
	default void method1() {
		System.out.println("Message from java 8 default method...");
	}
	
	static void method2() {
		System.out.println("Message from java 8 static method...");
	}
	
}
public class FunctionInterfaceTest {

	public static void main(String[] args) {
	  Interface1 obj = (a,b)-> System.out.println(" data's are "+a +" and "+b);;
	  
	  
	  obj.add(323, 2323);
	  obj.add(34,23);

	}

}
