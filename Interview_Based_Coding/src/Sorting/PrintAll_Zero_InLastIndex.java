package Sorting;

public class PrintAll_Zero_InLastIndex {

	public static void main(String[] args) {
		int a[] = { 0, 1, 4, 7, 0, 40, 0, 4, 7, 0 };
		int index[] = new int[a.length];
		int p = 0;

		for (int i = 0; i < a.length; i++) {

			if (a[i] != 0) {
				index[p] = a[i];
				p++;
			}
		}
		for (int i = 0; i < index.length; i++) {
			System.out.print(index[i] + " ");
		}
	}

}
