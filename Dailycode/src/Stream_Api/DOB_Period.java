package Stream_Api;

import java.time.LocalDate;
import java.time.Period;

public class DOB_Period {
	public static void main(String[] args) {
		LocalDate date=LocalDate.of(2002, 05, 22);
		LocalDate d=LocalDate.now();
		Period p=Period.between(date, d);
		System.out.println("Pinkuna Current Age is ::"+p.getYears()+"-"+p.getMonths()+"-"+p.getDays());
	}

}
