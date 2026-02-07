package Stream_Api;

import java.time.LocalTime;

public class GetTime {

	public static void main(String[] args) {
		LocalTime time =LocalTime.now();
		System.out.println(time);
		int hh=time.getHour();
		int mm=time.getMinute();
		int ss=time.getSecond();
		int ns=time.getNano();
		System.out.println(hh+"::"+mm+"::"+ss+"::"+ns);
	}
}
