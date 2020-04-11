package cs102project01;

public class Business extends Faculties {

	public Business(String name) {
		super(name);
	}

	public String toString() {
		return "Department Name: " + getName() + "\n" + super.toString();
	}
}
