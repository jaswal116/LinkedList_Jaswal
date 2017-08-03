package sorting;

public class InsertionDescendingSort {

	public static void main(String[] args) {
		InsertionDescendingSort bg = new InsertionDescendingSort();
		int[] x = { 1, 5, 7, 3, 5, 6, 8, 9 };
		int[] z = bg.doInsertionForDesSort(x);
		int[] y = bg.doInsertionWhileDesSort(x);
		System.out.println("array after doInsertionForDesSort ");
		for (int k : z) {
			System.out.print(k + " ");
		}
		System.out.println();
		System.out.println("array after doInsertionWhileDesSort ");
		for (int k : y) {
			System.out.print(k + " ");
		}
	}

	private int[] doInsertionForDesSort(int[] x) {
		// start outer iteration from : 1 until length
		// start inner iteration from : outerIndex-1 until ">=0" 
		// if inner index is less than inner index + 1 then swap values to place
		// smallest value at start
		int temp;
		for (int i = 1; i < x.length ; i++) {
			for (int j = i - 1; j >= 0; j--) {
				if (x[j] < x[j +1]) {
					temp = x[j];
					x[j] = x[j + 1];
					x[j + 1] = temp;
				}
			}
		}
		return x;
	}
	
	private int[] doInsertionWhileDesSort(int[] x) {
		int temp;
		for (int i = 1; i < x.length; i++) {
			int j = i - 1;
			while (j >= 0 && x[j] < x[j+1]) {
				temp = x[j];
				x[j] = x[j + 1];
				x[j + 1] = temp;
				j--;
			}
		}
		return x;
	}
}
