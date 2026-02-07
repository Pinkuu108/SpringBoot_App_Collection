package JAVA_8_PART2;
interface defaultmethod
{
	default void m1()
	{
		System.out.println("Default Method");
	}
}

public class Default_Method implements defaultmethod {

	public static void main(String[] args) {
		
		Default_Method f=new Default_Method();
		f.m1();
		
		
	}
}
