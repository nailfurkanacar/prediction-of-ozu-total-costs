package cs102project01;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Department> departments = new ArrayList<Department>();
		departments.add(new AviationMng("Aviation and Management"));
		departments.add(new Business("Economics"));
		departments.add(new Flight("Pilot Training"));
		departments.add(new Law("Law"));
		departments.add(new HotelManagement("Hotel Management"));
		departments.add(new GastAndCuli("Gastronomy and Culinary"));

		for (int i = 0; i < departments.size(); i++) {

			if (departments.get(i) instanceof Faculties) {
				System.out.println("This is a Faculty Program");
				System.out.println(departments.get(i));
				System.out.println("\n\n");

			} else if (departments.get(i) instanceof AppliedSciences) {
				System.out.println("This is a Applied Science Program");
				System.out.println(departments.get(i));
				System.out.println("\n\n");

			}
		}
		System.out.println("NOTE:" + "\n" + "Tuition and fees are revised annually for each academic year." + "\n"
				+ "Also, in the future  increases in the annual tuition for the"
				+ " subsequent academic years following the admission are determined based on the inflation rate."
				+ "\n" + "These calculations yield average results. Actual prices can be more or less. " + "\n"
				+ "These informations is taken from Özyeðin University website.");
	}
}
