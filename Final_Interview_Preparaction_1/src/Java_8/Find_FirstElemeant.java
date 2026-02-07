package Java_8;

import java.util.Arrays;
import java.util.List;

public class Find_FirstElemeant {

	public static void main(String[] args) {
	 
		List<Integer> li=Arrays.asList(2,3,1,4,7,8,90,4);
		li.stream().findFirst().ifPresent(System.out::println);

	}

}
