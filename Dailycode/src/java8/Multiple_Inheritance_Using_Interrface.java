package java8;

interface pinku1
{
	default  void m1()
	{
		System.out.println("Pinku M1 Method");
	}
}
interface chinu1
{
	default void m1()
	{
		System.out.println("Chinu M1 Method");
	}
}

public class Multiple_Inheritance_Using_Interrface implements chinu1,pinku1 {
	public static void main(String[] args) {
		
		Multiple_Inheritance_Using_Interrface m=new Multiple_Inheritance_Using_Interrface();
		m.m1();
		
	}

	@Override
	public void m1() {
		chinu1.super.m1();
	}

	
}
