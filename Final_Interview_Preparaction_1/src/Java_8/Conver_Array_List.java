package Java_8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Conver_Array_List {

	public static void main(String[] args) {
		
		int ar[]= {1,4,5,67,90};
		Arrays.stream(ar).boxed().collect(Collectors.toList()).forEach(System.out::println);

	}

}
