package com.projecteuler;

import java.util.HashSet;
import java.util.Set;

public class PrimeFactors {

	public static void main(String[] args) {
		System.out.println("Prime factors of 1092 are :  " + primeFactors(1092)); 

	}

	public static Set<Integer> primeFactors(long number) {
		Set<Integer> primefactors = new HashSet<>();
		long copyOfInput = number;
		for (int i = 2; i <= copyOfInput; i++) {
			if (copyOfInput % i == 0) {
				primefactors.add(i); // prime factor
				copyOfInput /= i;
				i--;
			}
		}
		return primefactors;

	}

}
