package cs102project01;

public class ArchandDesign extends Faculties {
	public ArchandDesign(String name) {
		super(name);
	}
	
	public String toString() {
		return "Department Name: " + getName() + "\n" + super.toString();
	}
	
}
