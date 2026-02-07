package java8;

import java.util.Date;
import java.util.function.Supplier;

public class Suplier_Interface {
	public static void main(String[] args) {
		
		Supplier<Date> s=()-> new Date();
		System.out.println(s.get());
	}

}
