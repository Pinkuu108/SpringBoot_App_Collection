package Java_8;

import java.util.Arrays;
import java.util.List;

public class Count_OfElemeantes_List {

	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(4,2,8,9,1,3,4,54,5,6,6,7,7);
		long count = li.stream().count();
		System.out.println(count);

	}

}
