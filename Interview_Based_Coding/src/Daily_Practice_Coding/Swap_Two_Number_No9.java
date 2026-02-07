package Daily_Practice_Coding;

public class Swap_Two_Number_No9 {
	public static void main(String[] args) {
		int a = 9;
		int b = 1;
		//Using 3rd Variable
		int c;
		c = a;
		a = b;
		b = c;
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("==================================");
		
		//Without Using 3rd Variable(+)
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		
		//Without Using 3rd Variable(*)
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("a=" + a);
		System.out.println("b=" + b);

	}

}
