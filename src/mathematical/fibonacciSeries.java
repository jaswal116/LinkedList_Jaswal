package com.projecteuler;

public class fibonacciSeries {

	public static void main(String[] args) {
		
		
		/*showFibonacciSeries(n);
		
		System.out.println("sum of fibonacci series : " + sumFibonacci(n));	*/
		
		sumEvenBelow(4000000);
	}

	
	private static void sumEvenBelow(int i) {
		int x =0;
		int y = 1;
		int z = x+y;
		int sumEven = 0;
		while(z<i){
			 x = y;
			 y = z;
			 z = x+ y;
			 if(z%2 ==0){
				 sumEven += z ;
			 }
		}
		System.out.println("sum of even valued fibonacci : " + sumEven);
	}


	private static void showFibonacciSeries(int i) {
		int[] s = new int[i];
		s[0] = 0;
		s[1] = 1;
		for(int k=2; k < i; k++){
            s[k] = s[k-2] + s[k-1];
        }
		System.out.print("FibonacciSeries : ");
		for(int k=0; k < i; k++){
                System.out.print(s[k] + " ");
        }
		System.out.println();
	}

	private static int sumFibonacci(int i) {
		int sum = 0;
		int a = 1;
		int b = 2;
		for (int j = 0; j < i; j++) {
			sum = a+b;
			a = b;
			b = sum;
		}
		
		return sum;
	}

}
