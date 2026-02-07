package Stram_Api_BY_RabiSir;

import java.util.List;

public class Count2 {
	public static void main(String[] args) {
		
		List<String> listname=List.of("pi","p","pintuna","pinkuna","pinkunaprusty");
		long count = listname.stream().filter(n->n.length()>3).count();
		System.out.println(count);
	}

}
