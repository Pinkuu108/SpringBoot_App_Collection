package Stream_Api;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ForEach {
	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(11);
		l.add(1);
		l.add(1);
		l.add(1111);
		l.add(11111);
		l.add(111);
		System.out.println(l);
		Consumer<Integer> c=a->{
			System.out.println("Integer elmeantes::"+a*a);
		};
		l.stream().forEach(c);
	}

}
