package ArrayQues;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class RandomArraySort {

	public static void main(String[] args) {
		  	int[] array = new int[10];
		  	Random rand = new Random();
		  	for (int i = 0; i < array.length; i++) {
				array[i] = rand.nextInt(100)+1 ;				
			}
		  	Arrays.sort(array);
		  	System.out.println(Arrays.toString(array));
		  	//To print in reverse order
		  	System.out.print("[");
		  	for (int i = array.length-1; i >=0 ; i--) {
		  		if(i!=0){
		  			System.out.print(array[i] + ", ");
		  		}else{
		  			System.out.print(array[i]);
		  		}
			}
		  	System.out.print("]");
	}

}
