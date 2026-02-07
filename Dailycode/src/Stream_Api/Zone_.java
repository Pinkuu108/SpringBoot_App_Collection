package Stream_Api;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Zone_ {
	public static void main(String[] args) {
		ZoneId z=ZoneId.systemDefault();
		System.out.println(z);
		
		ZoneId la=ZoneId.of("America/Los_Angeles");
		ZonedDateTime t=ZonedDateTime.now(la);
		System.out.println(t);
	}

}
