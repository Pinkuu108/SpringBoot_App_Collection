package Stream_Api_FullCode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Convert_ListofString_ToUpperCase {

	public static void main(String[] args) {
		List<String> str=Arrays.asList("pinku","chinu","lizun","soham","bisyut","santosh");
		List<String> collect = str.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(collect);
	}
}
