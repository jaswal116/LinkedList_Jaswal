package sorting;

public class Merge2SortedArrays {

	public static void main(String[] args) {
		int[] a = { 2, 4, 6, 8, 10 };
		int[] b = { 1, 3, 15, 17, 19 };
		int[] c = new int[10];
		merge2(c, a, b);

	}

	private static void merge2(int[] c, int[] a, int[] b) {
		int j = 0;
		int k = 0;
		for (int i = 0; i < c.length; i++) {
			if (j < a.length && k < b.length) {
				if (a[j] < b[k]) {
					c[i] = a[j];
					j++;
				} else {
					c[i] = b[k];
					k++;
				}
			} else if (j == a.length) {
				c[i] = b[k];
				k++;
			} else if (k == b.length) {
				c[i] = a[j];
				j++;
			}
		}
		System.out.println("Sorted combined array is : ");
		for (int i : c) {
			System.out.print(i + " ");
		}
	}
}
