package Java_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EverNuber_FromList {

	 public static void main(String[] args) {
		List<Integer> l=Arrays.asList(1,2,3,4,5,6,7,8,9);
		l.stream().filter(s->s%2==0).collect(Collectors.toList()).forEach(System.out::println);
	}
}
