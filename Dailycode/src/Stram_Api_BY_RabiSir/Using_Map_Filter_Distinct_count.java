package Stram_Api_BY_RabiSir;

import java.util.Arrays;
import java.util.List;

public class Using_Map_Filter_Distinct_count {
	public static void main(String[] args) {
		List<String> list=List.of("pinkuna","pinku","lizun","pinkuna","chinua","santosh","santosh");
		
//		long count = list.stream().map(String::toUpperCase).filter(s->s.contains("A")).distinct().count();
//		System.out.println("Using_Map_Filter_Distinct_count.main():::"+count);
		
		list.stream().map(String::toUpperCase).forEach(System.out::println);
		System.out.println("=========================================");
		list.stream().filter(s->s.contains("c")).forEach(System.out::println);
		
	}

}
