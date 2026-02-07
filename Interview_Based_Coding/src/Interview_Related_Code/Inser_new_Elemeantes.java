package Interview_Related_Code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Inser_new_Elemeantes {

	public static void main(String[] args) {

		
		int a[] = { 1, 5, 3, 8, 0, 3, 6, 8, 2, 9, 8, 6 };
		int newindex[] = new int[a.length + 1];

		int num = 33;
		int index = 2;
		for (int i = 0; i < index; i++) {
			newindex[i] = a[i];
		}

		newindex[index] = num;

		for (int i = index; i < a.length; i++) {
			newindex[i + 1] = a[i];
		}
		for (int i = 0; i < newindex.length;i++) { System.out.print(newindex[i]+" "); }
		 

		ArrayList<Integer> l = new ArrayList<>(Arrays.asList(1, 5, 3, 8, 0, 3, 6, 8, 2, 9, 8, 6));
		// l.add(2, 9);
		// l.remove(1);

		System.out.print(l + ",");
	}

}
