package cs102project01;

public class Engineering extends Faculties{

	public Engineering(String name) {
		super(name);
	}

	public String toString() {
		return "Department Name: " + getName() + "\n" + super.toString();
	}
}
