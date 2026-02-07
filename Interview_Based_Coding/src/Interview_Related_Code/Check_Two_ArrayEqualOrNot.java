package Interview_Related_Code;

import java.util.Arrays;

public class Check_Two_ArrayEqualOrNot {

	public static void main(String[] args) {
		int a[]= {12,22,33,44,55};
		int b[]= {12,22,33,44};
		
		boolean s=Arrays.equals(a, b);
		if(s==true)
		{
			System.out.println("Two Arrays are equal");
		}
		else
		{
			System.out.println("Two Arrays Are Not Equal");
		}
	}
}
