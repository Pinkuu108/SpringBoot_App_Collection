package Main_All_Impo_Coding;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Frequesncy_Each_Character {

	public static void main(String[] args) {
		String name = "Chin";

		Map<String,Long> collect = Arrays.stream(name.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(collect);
		
	}

}
