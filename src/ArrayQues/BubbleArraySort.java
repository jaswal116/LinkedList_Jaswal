package ArrayQues;

import java.util.Arrays;
import java.util.Random;

public class BubbleArraySort {

	public static void main(String[] args) {
		int[] array = new int[10];
		Random rand = new Random();
		for (int i = 0; i < array.length; i++){
			array[i] = rand.nextInt(100) + 1;
		}
		int[] a = BubbleArraySort.bubbleSort(array);
		System.out.println("Ascending array: "+ Arrays.toString(a));	
		int[] b = BubbleArraySort.bubbleSortDescending(array);
		System.out.println("Descending array: "+Arrays.toString(b));	
	}
		
	public static int[] bubbleSort(int[] array) {
		boolean swapped= true ; 
		int j = 0;
		int tmp;
		
		while (swapped) {
			swapped = false;
			j++;
			for (int i = 0; i < array.length-j; i++) {
				if (array[i]>array[i+1]) {
					tmp = array[i];
					array[i] = array[i+1];
					array[i+1] = tmp;
					swapped = true;
				}
			}
		}
		return array;
		
	}
	public static int[] bubbleSortDescending(int[] array) {
		boolean swapped= true ; 
		int j = 0;
		int tmp;
		
		while (swapped) {
			swapped = false;
			j++;
			for (int i = 0; i < array.length-j; i++) {
				if (array[i]<array[i+1]) {
					tmp = array[i];
					array[i] = array[i+1];
					array[i+1] = tmp;
					swapped = true;
				}
			}
		}
		return array;
		
	}
}
