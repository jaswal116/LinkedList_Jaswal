package codingquest;


import java.util.LinkedList;
import java.util.List;


public class ListFactors {

	public static void main(String[] args) {
	System.out.println(findFactors(478143098));	

	}

	private static List<Integer> findFactors(long i) {
		List<Integer> factors = new LinkedList<>();
		for (int j = 2; j <= i; j++) {
			if (i % j == 0) {
				factors.add(j);
				i /= j ;
				j--;
			}
		}
		return factors;
		
	}

}
