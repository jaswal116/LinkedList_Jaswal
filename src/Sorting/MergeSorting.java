package sorting;

	// This merge sorting avoid using infinity and mergeSort() has a single array as input
public class MergeSorting {

	public static void main(String[] args) {
		int[] x = { 91, 95, 71, 23, 54, 16, 8, 9, 16, 85 };
		mergeSort(x);
		System.out.println();
		for (int i : x) {
			System.out.print(i + " ");
		}
	}

	private static void mergeSort(int[] x) {
		int n = x.length;
		int mid = n/2;
		if (1== n) {
			return ;
		}
		// created two arrays
		int[] b = new int[mid];
		int[] c = new int[n-mid];
		for (int i = 0; i < mid; i++) {
			b[i] = x[i];
		}
		for (int j = mid; j < n; j++) {
			c[j-mid] = x[j];
		}
		mergeSort(b);
		mergeSort(c);
		merge(x, b, c);

	}

	private static void merge(int[] x, int[] a, int[] b) {
		int j = 0;
		int k = 0;
		for (int i = 0; i < x.length; i++) {
			if (j < a.length && k < b.length) {
				if (a[j] < b[k]) {
					x[i] = a[j];
					j++;
				} else {
					x[i] = b[k];
					k++;
				}
			} else if (j == a.length) {
				x[i] = b[k];
				k++;
			} else if (k == b.length) {
				x[i] = a[j];
				j++;
			} 
		}
		
	}
}
