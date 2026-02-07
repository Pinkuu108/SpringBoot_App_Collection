package Java_8;

import java.util.Arrays;
import java.util.List;

public class PrintAllEle_FOrEachLoop {

	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(2,3,42,4);
		li.forEach(System.out::println);
	}

}
