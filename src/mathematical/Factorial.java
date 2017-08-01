package codingquest;

public class Factorial {
	// factorial is product of an integer and all the integers below it e.g 10! = 10 * 9!
	
	public static void main(String[] args) {
		
		System.out.println("4! = " + factorialRecursion(4));
		System.out.println("5!  = " + factorialWithoutRecursion(5));
    }
    
    private static long factorialWithoutRecursion(int num){
        long fact =1;
        while(num > 0){
            fact *= num--;
        }
        return fact;
    }
	private static long factorialRecursion(int num){
        if(num==1)
            return 1;
        else 
            return num*factorialRecursion(num-1);
    }
}
