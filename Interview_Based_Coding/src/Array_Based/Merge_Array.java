package Array_Based;

import java.util.Arrays;

public class Merge_Array {

	public static void main(String[] args) {
		int array1[]= {2,5,7,9};
		int array2[]= {1,4,6,3,8,0};
		int len1=array1.length;
		int len2=array2.length;
		int array3[]=new int[len1+len2];
		for(int i=0;i<array1.length;i++)
		{
			array3[i]=array1[i];
		}
		for(int i=0;i<array2.length;i++)
		{
			array3[len1+i]=array2[i];
		}
		Arrays.sort(array3);
		for(int i=0;i<array3.length;i++)
		{
			System.out.print(array3[i]+",");
		}
	}
}
