package Java_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class gretter_Than100 {

	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(1,2,45,2,5,27,121,890,900,345,222);
		li.stream().filter(s->s>100).collect(Collectors.toList()).forEach(System.out::println);

	}

}
