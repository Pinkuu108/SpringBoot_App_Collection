package JAVA_8_PART2;
class Sample
{
	private String s;

	public Sample(String s) {
		super();
		this.s = s;
		System.out.println("Constructor executed "+s);
	}
	
}
interface interf
{
	public Sample get(String s);
}

public class Constructor_Reference {
	public static void main(String[] args) {
		interf f=s->new Sample(s);
		f.get("from lamba Expresion");
		interf f1=Sample::new;
		f1.get("From constructor Rreference");
	}

}
