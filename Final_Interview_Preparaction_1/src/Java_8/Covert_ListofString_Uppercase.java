package Java_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Covert_ListofString_Uppercase {

	public static void main(String[] args) {
		
		List<String> l=Arrays.asList("pinku","chinu");
		l.stream().map(s->s.toUpperCase()).collect(Collectors.toList()).forEach(System.out::println);

	}

}
