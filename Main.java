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
				System.out.println("\n");

			} else if (departments.get(i) instanceof AppliedSciences) {
				System.out.println("This is a Applied Science Program");
				System.out.println(departments.get(i));
				System.out.println("\n");

			}
		}
	}
}
