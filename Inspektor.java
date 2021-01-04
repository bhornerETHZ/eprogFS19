// Exercise 4
package eprogFS19;

import java.util.Map;

public class Inspektor {

	public static void main(String[] args) {
		eintrag("Stall-1 0.5 0.1667 XYZ");
		// gefahrenStufe(); // -> OK
		// besteStaelle(); // -> {XYZ=Stall-1}
		eintrag("Stall-2 -1");
		// gefahrenStufe(); // -> PANDEMIE
		eintrag("Stall-2 0.7 0.15 ABC");
		eintrag("Stall-3 0.7 0.185 ABC");
		gefahrenStufe(); // -> EPIDEMIE
		// besteStaelle(); // -> {ABC=Stall-3, XYZ=Stall-1}
	}

	public static void eintrag(String input) {
		// TODO
	}

	public static void gefahrenStufe() {
		// TODO
	}

	public static Map besteStaelle() {
		// TODO
		return null;
	}

}
