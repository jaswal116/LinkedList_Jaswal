/**
 * 
 */
package com.projecteuler;

/**
 * @author JJ
 *
 */
public class primeNumber {

	
	public static void main(String[] args) {
		System.out.println( "largest primefactor is : " + primeNumber.largestPrimeFactor(600851475143l));
	}
	
	private static int largestPrimeFactor(long number) {
        int i;

        for (i = 2; i <= number; i++) {
            if (number % i == 0) {
                number /= i;
                i--;
            }
        }

        return i;
    }
	

	

}
