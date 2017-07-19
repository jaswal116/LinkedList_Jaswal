package com.projecteuler;

public class SumMultiple {
	
	
	
	public static void main(String[] args) {
		
	System.out.println("sum of multiples : " +	sumMultiples(1000));

	}
	
	
	
	private static int sumMultiples(int i) {
		int sum = 0;
		for (int j = 1; j < i; j++ ) {
			if (j % 3 == 0) {
				sum = sum + j;
			} else if (j % 5 == 0) {
				sum = sum + j;
			}
			
		}
		return sum;
		
	}

}
