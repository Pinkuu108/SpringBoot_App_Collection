package Collection;

import java.nio.file.DirectoryStream.Filter;
import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Iterrate_Using_HashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "java");
		map.put(4, "C");
		map.put(3, "python");
		map.put(2, "go");
		map.put(5, "Dsa");

		// map.forEach((k, v) -> System.out.println("key" + "=" + k + "," + "value" +
		// "=" + v));
		// sort using key value
		/*
		 * map.entrySet().stream().sorted(Map.Entry.comparingByKey()) .forEach(e ->
		 * System.out.println(e.getKey() + "=" + e.getValue()));
		 */
		// Sort using value Format
		// map.entrySet().stream().sorted(Map.Entry.comparingByValue())
		// .forEach(e -> System.out.println(e.getKey() + "=" + e.getValue()));

		// FIND ONLY KEY FORM MAP
		List<Integer> collect = map.keySet().stream().collect(Collectors.toList());
		System.out.println(collect);
		// find only valur from map
		List<String> collect2 = map.values().stream().collect(Collectors.toList());
		System.out.println(collect2);
	}
}
