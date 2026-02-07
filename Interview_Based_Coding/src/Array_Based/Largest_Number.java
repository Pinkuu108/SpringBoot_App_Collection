package Array_Based;

public class Largest_Number {

	public static void main(String[] args) {
		int num[]= {1,2,3,4,5,6,7};
		int largest=num[0];
		for(int i=0;i<num.length;i++)
		{
			if(largest<num[i])
			{
				largest=num[i];
			}
		}
		System.out.println("Largest Number is ::"+largest);
	}
}
