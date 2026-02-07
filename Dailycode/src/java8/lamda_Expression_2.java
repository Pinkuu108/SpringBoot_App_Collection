package java8;



interface pinku
{
	public int square(int p);
}

public class lamda_Expression_2 {

	public static void main(String[] args) 
	{
		pinku i= p->p*p;
		System.out.println(i.square(9));
		System.out.println("Square is:"+i.square(6));

	}

}
