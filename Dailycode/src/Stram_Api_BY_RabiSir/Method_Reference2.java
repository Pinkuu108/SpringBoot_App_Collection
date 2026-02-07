package Stram_Api_BY_RabiSir;
interface add
{
	public  void m1(int a,int b);
}

public class Method_Reference2 {

	public static void m(int c,int d)
	{
		System.out.println("Method_Reference2.m()::"+(c+d));
	}
	public static void main(String[] args) {
		add p=(a,b)->
		{
			System.out.println("The Sum is::"+(a+b));
		};
		p.m1(1060, 1040);

		
		add ad=Method_Reference2::m;
		ad.m1(20, 80);
	}

}
