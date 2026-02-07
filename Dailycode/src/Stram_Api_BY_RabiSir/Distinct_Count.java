package Stram_Api_BY_RabiSir;

import java.util.List;

public class Distinct_Count {
	public static void main(String[] args) {
		List<String> listname=List.of("pk","chinu","pinku","pk");
		long count = listname.stream().distinct().count();
		System.out.println("Distinct_Count.main()::"+count);
	}

}
