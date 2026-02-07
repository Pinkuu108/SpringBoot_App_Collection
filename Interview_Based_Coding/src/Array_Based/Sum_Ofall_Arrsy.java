package Array_Based;

public class Sum_Ofall_Arrsy {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 0, 5 };
		int sum = getsum(a);
		System.out.println("The Total Array Sum is ::" + sum);

	}

	public static int getsum(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];

		}
		return sum;
	}
}
