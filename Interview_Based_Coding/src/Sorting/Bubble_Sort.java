package Sorting;

public class Bubble_Sort {
	public static void main(String[] args) {
		int a[] = { 1, 6, 9, 2, 0, 4, 3, 5, 7, 8 };

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length-1; j++) {
				int temp;
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;

				}
			}
		}
		for (int x : a) {
			System.out.print(x + " ");
		}
	}
}
