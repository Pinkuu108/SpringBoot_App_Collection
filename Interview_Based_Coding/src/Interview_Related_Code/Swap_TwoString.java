package Interview_Related_Code;

public class Swap_TwoString {
	public static void main(String[] args) {
		String a="pinku";
		String b="chinu";
		System.out.println("Before Swap a is::"+a);
		System.out.println("Before Swap b is ::"+b);
		a=a+b; 
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
		
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		System.out.println("After Swap a is::"+a);
		System.out.println("After Swap b is ::"+b);
	}

}
