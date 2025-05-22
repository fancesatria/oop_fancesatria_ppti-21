package actor;

public class Person {
	protected String name, dob;

	
	// Constructor: alt shift s o
	// Getter setter: alt shift s r
	public String getName() {
		return name;
	}

	public Person(String name, String dob) {
		this.name = name;
		this.dob = dob;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
	
	
}
