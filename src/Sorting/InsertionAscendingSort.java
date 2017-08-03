package sorting;

public class InsertionAscendingSort {

	public static void main(String[] args) {
		InsertionAscendingSort bg = new InsertionAscendingSort();
		int[] x = { 1, 5, 7, 3, 5, 6, 8, 9 };
		int[] z = bg.doInsertionForSort(x);
		int[] p = bg.doInsertionForSort2(x);
		int[] y = bg.doInsertionWhileSort(x);
		System.out.println("array after doInsertionForSort ");
		for (int k : z) {
			System.out.print(k + " ");
		}
		System.out.println();
		System.out.println("array after doInsertionForSort2 ");
		for (int k : p) {
			System.out.print(k + " ");
		}
		System.out.println();
		System.out.println("array after doInsertionWhileSort ");
		for (int k : y) {
			System.out.print(k + " ");
		}
	}

	private int[] doInsertionForSort(int[] x) {
		// start outer iteration from : 1 until length
		// start inner iteration from : outerIndex-1 until ">0" or ">=1"
		// if inner index is less than inner index - 1 then swap values to place
		// smallest value at start
		int temp;
		for (int i = 1; i < x.length; i++) {
			for (int j = i - 1; j > 0; j--) {
				if (x[j] < x[j - 1]) {
					temp = x[j];
					x[j] = x[j - 1];
					x[j - 1] = temp;
				}
			}
		}
		return x;
	}
	
	private int[] doInsertionForSort2(int[] x) {
		// start outer iteration from : length - 2 until 0
		// start inner iteration from : outerIndex+1 until "< length-1" or "<= length-2"
		// if inner index is less than inner index - 1 then swap values to place
		// smallest value at start
		int temp;
		for (int i = x.length-2; i >=0 ; i--) {
			for (int j = i + 1; j < x.length-1; j++) {
				if (x[j] > x[j + 1]) {
					temp = x[j];
					x[j] = x[j + 1];
					x[j + 1] = temp;
				}
			}
		}
		return x;
	}
	
	private int[] doInsertionWhileSort(int[] x) {
		int i, j, key, temp;
		for (i = 1; i < x.length; i++) {
			key = x[i];
			j = i - 1;
			while (j >= 0 && key < x[j]) {
				temp = x[j];
				x[j] = x[j + 1];
				x[j + 1] = temp;
				j--;
			}
		}
		return x;
	}
}
