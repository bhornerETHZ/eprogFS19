// Exercise 2
package eprogFS19;

public class Pair {
	int summand1;
	int summand2;
	
	public Pair(int i, int j) {
		this.summand1 = i;
		this.summand2 = j;
	}
	
	public String toString() {
		return (summand1 + ", " + summand2);
	}
}
