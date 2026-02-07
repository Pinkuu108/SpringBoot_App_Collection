package Stram_Api_BY_RabiSir;

import java.util.stream.Stream;

public class Count1 {

	public static void main(String[] args)  {
		Long s=Stream.of("Pk","pkk","pkkk","pk","pk").count();
		System.out.println(s);

	}

}
