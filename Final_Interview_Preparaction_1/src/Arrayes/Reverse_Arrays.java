package Arrayes;

import java.util.Iterator;

public class Reverse_Arrays {

	public static void main(String[] args) {
		
		//1st Approach
		/*
		 * for(int i=a.length-1;i>=0;i--) { System.out.print(a[i]+" "); }
		 */
		//2nd Approach 
		int a[]= {1,2,3,4,5,6,7,8,9};
		int start=0;
		int end=a.length-1;
		while(start<end)
		{
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
		}
		for (int p : a) {
			System.out.print(p+" ");
		}
	}

}
