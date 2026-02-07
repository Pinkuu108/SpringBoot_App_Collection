package java8;

interface pkk
{
	public void m1();
	default void m2() {
		System.out.println("Default Interface Method");
	}
}

public class Default_Method implements pkk {

	public static void main(String[] args) {
		System.out.println("Main Method ");
		
	}

	@Override
	public void m1() {
		System.out.println("Overriding Method ");
		
	}
}
