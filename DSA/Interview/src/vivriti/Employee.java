
package vivriti;

public class Employee {
	
	private String name;
	
	private int age;
	
	private String deparment;
	
	

	public Employee() {
		super();
	}

	public Employee(String name, int age, String deparment) {
		super();
		this.name = name;
		this.age = age;
		this.deparment = deparment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDeparment() {
		return deparment;
	}

	public void setDeparment(String deparment) {
		this.deparment = deparment;
	}
	
	

}
