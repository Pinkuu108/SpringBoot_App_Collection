package Java_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNAme_StartWith_Specific_Letter {

	public static void main(String[] args) {
		List<String> li=Arrays.asList("pinku","chinu","happy","santosh","lozun","bidyut");
        //li.stream().filter(s->s.contains("p")).collect(Collectors.toList()).forEach(System.out::println);
		
		li.stream().filter(s->s.startsWith("p")).collect(Collectors.toList()).forEach(System.out::println);
	
	}

}
