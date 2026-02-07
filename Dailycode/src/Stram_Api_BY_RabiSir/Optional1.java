package Stram_Api_BY_RabiSir;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Optional1 {

	public static void main(String[] args) {
	List<Integer> l=Arrays.asList(20,10,40,5,7,9);
	Optional<Integer> min=l.stream().min(Integer::compareTo);
	min.ifPresent(System.out::println);

	}

}
