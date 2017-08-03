package sorting;

public class SelectionAscendingSort {

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
