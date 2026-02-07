package Daily_Practice_Coding;

public class Swap_TwoString_WithoutTemp_No10 {
	public static void main(String[] args) {
		
		String a="pinku";
		String b="chinu";
		System.out.println("Before Swap a::"+a);
		System.out.println("Before Swap b::"+b);
		System.out.println("=============================");
		a=a+b;
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		
		System.out.println("After Swap a::"+a);
		System.out.println("After Swap b::"+b);
	}

}
