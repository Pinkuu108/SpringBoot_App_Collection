package Daily_Practice_Coding;

public class Largest_Smallest_No_Array_NO7 {
	public static void main(String[] args) {
		int a[] = { 0,1,8,6,4,3,7};
		int largest = a[0];
		int smallest = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > largest) {
				largest = a[i];
			} else if (a[i] < smallest) {
				smallest = a[i];
			}

		}
		System.out.println("largest::" + largest);
		System.out.println("smallest::" + smallest);
	}

}
