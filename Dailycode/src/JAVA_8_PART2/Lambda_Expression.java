package JAVA_8_PART2;
interface inter
{
	public abstract void m1();
}

public class Lambda_Expression {

	public static void main(String[] args) {
		inter i=()->System.out.println("HELLO HAPPY");
		i.m1();
	}
}
