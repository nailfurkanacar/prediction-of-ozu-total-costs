package cs102project01;

public class Law extends Faculties {
	public Law(String name) {
		super(name);
	}

	public String toString() {

		return "Department Name:" + getName() + "\n"
				+ "For the Law Faculty, students do not have to pass Trace Exam to start the courses because in Turkey, Law courses are taught in Turkish."
				+ "\n" + "However, you can get Preparatory English Program optionally." + "\n" + "If you finish "
				+ getName() + " department in 4 years, you will have paid a total of " + getCalcTotalPrice() + " TL.";

	}
}
