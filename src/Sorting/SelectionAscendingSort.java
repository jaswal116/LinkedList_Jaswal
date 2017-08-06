package sorting;

public class SelectionAscendingSort {
	
	// The algorithm proceeds by finding the smallest element in the unsorted subarray, 
	// swapping it with the leftmost unsorted element (putting it in sorted order), 
	// and moving the subarray boundaries one element to the right.
	// The algorithm divides the input array into two parts:
	// 1: the subarray of items already sorted, which is built up from left to right, and 
	// 2: the subarray of items remaining to be sorted that occupy the rest of the array.

	
	public static void main(String[] args) {
		SelectionAscendingSort sc = new SelectionAscendingSort();
		int[] x = { 1, 5, 7, 3, 4, 6, 8, 9 };
		int[] y = sc.doSelectionSort(x);
		System.out.println("array after doSelectionSort ");
		for (int k : y) {
			System.out.print(k + " ");
		}
	}
	private int[] doSelectionSort(int[] x) {
		int i, j, minValue, minIndex, temp = 0;
		for (i = 0; i < x.length; i++) {
			minValue = x[i];
			minIndex = i;
			for (j = i ; j < x.length; j++) {
				if (x[j] < minValue) {
					minValue = x[j];
					minIndex = j;
				}
			}
			if (minValue < x[i]) {
				temp = x[i];
				x[i] = x[minIndex];
				x[minIndex] = temp;
			}
		}
		return x;
	}

}
