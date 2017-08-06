package sorting;



public class SortEvenOddArray {

	public static void main(String[] args) {
		
		int[] x = { 1, 11, 4, 5, 2, 3, 7, 6, 10, 8, 2, 9 };
		doSort(x);
		for (int i : x) {
			System.out.print(i + " ");
		}
	}

	private static void doSort(int[] x) {
		int temp, a = 0;
		for (int i = 0; i < x.length - a;) {
			if (x[i] % 2 == 0) {
				for (int j = 0; j < i; j++) {
					for (int j2 = j+1; j2 <= i; j2++) {
						if (x[j] > x[j2]) {
							int temp1 = x[j];
							x[j]  = x[j2];
							x[j2] = temp1;
							
						}
					}
				}
				
				i++;
				
			} else {
				temp = x[i];
				x[i] = x[x.length - a - 1];
				x[x.length - a - 1] = temp;
				for (int j = x.length-1; j > x.length-a-1; j--) {
					for (int j2 = j-1; j2 >= x.length-a-1; j2--) {
						if (x[j] < x[j2]) {
							int temp1 = x[j];
							x[j]  = x[j2];
							x[j2] = temp1;
							
						}
					}
				}
				a++;
			}
		}

	}

}
