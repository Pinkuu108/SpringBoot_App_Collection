package Stream_Api;

import java.time.LocalDateTime;
import java.time.Month;

public class Local_DateTimee{

	public static void main(String[] args) {
		LocalDateTime time=LocalDateTime.of(2002, Month.MAY, 01, 20, 22);
		System.out.println(time);
		System.out.println(time.plusMonths(6));
		System.out.println(time.minusMonths(6));
	}
}
