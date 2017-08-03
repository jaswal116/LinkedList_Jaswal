package sorting;

public class BubbleDescendingSort {

	public static void main(String[] args) {
		BubbleDescendingSort bg = new BubbleDescendingSort();
		int[] x = { 1, 5, 7, 3, 4, 6, 8, 9 };
		int[] z = bg.doBubbleDescenSort(x);
		for (int i : z) {
			System.out.print(i + " ");
		}
		System.out.println();
		int[] y = bg.doBubbleDescenWhileSort(x);
		for (int i : y) {
			System.out.print(i + " ");
		}
	}

	private int[] doBubbleDescenWhileSort(int[] x) {
		boolean swapped = true;
		int j = 0;
		int temp;
		while (swapped) {
			swapped = false;
			j++;
			for (int i = 0; i < x.length - j; i++) {

				if (x[i] < x[i + 1]) {
					temp = x[i];
					x[i] = x[i + 1];
					x[i + 1] = temp;
					swapped = true;
				}
			}
		}
	return x;

	}

	private int[] doBubbleDescenSort(int[] x) {
		int i, j, temp;
		for (i = 0; i < x.length - 1; i++) {
			for (j = 1; j < x.length - i; j++) {
				if (x[j] > x[j - 1]) {
					temp = x[j - 1];
					x[j - 1] = x[j];
					x[j] = temp;
				}
			}
		}
		return x;
	}
}
