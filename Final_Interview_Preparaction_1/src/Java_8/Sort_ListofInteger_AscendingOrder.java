package Java_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sort_ListofInteger_AscendingOrder {

	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(4,0,6,2,9,7,3,5,8,1);
        li.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
	}

}
