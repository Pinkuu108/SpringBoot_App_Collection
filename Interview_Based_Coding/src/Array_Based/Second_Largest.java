package Array_Based;

public class Second_Largest {

	public static void main(String[] args) {
		int num[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9,99 };

		int largest = Integer.MIN_VALUE;
		int secondlargest = Integer.MIN_VALUE;

		for (int i = 0; i < num.length; i++) {

			if(largest<num[i])
			{
				secondlargest=largest;
				largest=num[i];
			}
			else if(num[i]>secondlargest&&largest!=secondlargest)
			{
				secondlargest=num[i];
			}
		}
		System.out.println("Second Largest Number is ::"+secondlargest);
	}
}
