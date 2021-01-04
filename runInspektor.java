// Exercise 4: file 2/2
package eprogFS19;

public class runInspektor {

	public static void main(String[] args) {
		Inspektor inspektor = new Inspektor();
		
		inspektor.eintrag("Stall-1 0.5 0.1667 XYZ");
		// gefahrenStufe(); // -> OK
		// besteStaelle(); // -> {XYZ=Stall-1}
		inspektor.eintrag("Stall-2 -1");
		// gefahrenStufe(); // -> PANDEMIE
		inspektor.eintrag("Stall-2 0.7 0.15 ABC");
		inspektor.eintrag("Stall-3 0.7 0.185 ABC");
		inspektor.gefahrenStufe(); // -> EPIDEMIE
		// besteStaelle(); // -> {ABC=Stall-3, XYZ=Stall-1}
	}

}
