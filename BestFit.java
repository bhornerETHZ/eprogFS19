import java.util.*;
public class BestFit {
	public static void main(String[] args) {
		HashSet<Integer> test = new HashSet<Integer>();		//Example 1
		test.add(3);
		test.add(4);
		test.add(7);
		int D1=6;
		ArrayList<Integer> res1 = bestFit(test, D1);
		System.out.println(res1);
		
		HashSet<Integer> test2 = new HashSet<Integer>();	//Example 2
		test2.add(0);
		test2.add(3);
		test2.add(6);
		test2.add(10);
		int D2=5;
		ArrayList<Integer> res2 = bestFit(test2, D2);
		System.out.println(res2);
		
	}
	
	
	
	public static ArrayList<Integer> bestFit(Set<Integer> werte, int durchschnitt) {
		//TODO
		
		return null;
		
		
		
		
	}
}

