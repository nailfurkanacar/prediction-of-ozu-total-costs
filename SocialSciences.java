package cs102project01;

public class SocialSciences extends Faculties{

	public SocialSciences(String name) {
		super(name);
	}

	public String toString() {
		return "Department Name: " + getName() + "\n" + super.toString();
	}
}
