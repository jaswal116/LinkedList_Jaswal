package sorting;

public class BubbleAscendingSort {
	
	// Bubble sort algorithm compares each pair of adjacent elements and swaps them if they are in the wrong order. 
	// The pass through the array is repeated until no swaps are needed, which indicates that the array is sorted.
	
	public static void main(String[] args) {
		BubbleAscendingSort bg = new BubbleAscendingSort();
		int[] x = { 1, 5, 7, 3, 4, 6, 8, 9 };
		int[] y = bg.doBubbleAscenSort(x);
		for (int i : y) {
			System.out.print(i + " ");
		}
		System.out.println();
		int[] z = bg.doBubbleAscenWhileSort(x);
		for (int i : z) {
			System.out.print(i + " ");
		}
	}

	private int[] doBubbleAscenWhileSort(int[] x) {
		boolean swapped = true;
		int j = 0;
		int temp;
		while (swapped) {
			swapped = false;
			j++;
			for (int i = 0; i < x.length - j; i++) {
				if (x[i] > x[i + 1]) {
					temp = x[i];
					x[i] = x[i + 1];
					x[i + 1] = temp;
					swapped = true;
				}
			}
		}
		return x;
	}

	private int[] doBubbleAscenSort(int[] x) {
		int i, j, temp;
		for (i = 0; i < x.length - 1; i++) {
			for (j = 0; j < x.length - 1 - i; j++) {
				if (x[j] > x[j + 1]) {
					temp = x[j + 1];
					x[j + 1] = x[j];
					x[j] = temp;
				}
			}
		}
		return x;
	}

}
