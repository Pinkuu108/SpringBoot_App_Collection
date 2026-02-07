package Arrayes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Insert_New_Elemeantes_Array {

	public static void main(String[] args) {
		/*
		 * List<Integer> l=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		 * l.add(2, 90); System.out.println(l);
		 */

		int[] a = new int[6];   // extra space
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;

		int size = 5;
		int index = 2;
		int num = 90;

		// shift elements
		for (int i = size; i > index; i--) {
		    a[i] = a[i - 1];
		}

		// insert value
		a[index] = num;

		// print result
		for (int i = 0; i <= size; i++) {
		    System.out.print(a[i] + " ");
		}


	}

}
