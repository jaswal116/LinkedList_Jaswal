package sorting;

public class SelectionDescendingSort {

	public static void main(String[] args) {
		SelectionDescendingSort sc = new SelectionDescendingSort();
		int[] x = { 1, 5, 7, 3, 4, 6, 8, 9 };

		int[] z = sc.doSelectionDesSort(x);
		int[] k = sc.doSelectionDesSort2(x);
		System.out.println("array after doSelectionDesSort ");
		for (int s : z) {
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println("array after doSelectionDesSort2 ");
		for (int t : k) {
			System.out.print(t + " ");
		}
	}

	private int[] doSelectionDesSort2(int[] x) {
		int i, j, maxIndex, temp;
		for (i = x.length - 1; i > 0; i--) {
			maxIndex = 0;
			for (j = 1; j <= i; j++) {
				if (x[j] < x[maxIndex]) {
					maxIndex = j;
				}
			}
			temp = x[maxIndex];
			x[maxIndex] = x[i];
			x[i] = temp;
		}

		return x;
	}

	private int[] doSelectionDesSort(int[] x) {
		int i, j, maxValue, maxIndex, temp = 0;
		for (i = 0; i < x.length; i++) {
			maxValue = x[i];
			maxIndex = i;
			for (j = i; j < x.length; j++) {
				if (x[j] > maxValue) {
					maxValue = x[j];
					maxIndex = j;
				}
			}
			if (maxValue > x[i]) {
				temp = x[i];
				x[i] = x[maxIndex];
				x[maxIndex] = temp;
			}
		}
		return x;
	}
}
