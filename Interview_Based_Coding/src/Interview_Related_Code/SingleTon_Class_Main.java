package Interview_Related_Code;

class singleTon {
	private static singleTon instance;

	private singleTon() {

		super();
		System.out.println("Private Constructor IS Executed..");
	}

	public static singleTon getinstsance() {

		if (instance == null) {
			instance = new singleTon();
		}
		return instance;
	}

	public void getmessage() {
		System.out.println("singleTon.getmessage()");
	}

}

public class SingleTon_Class_Main {
	public static void main(String[] args) {
		singleTon s1= singleTon.getinstsance();
		s1.getmessage();
		
		singleTon s2= singleTon.getinstsance();
		s2.getmessage();
		
		
		
		System.out.println("S1 hash code::"+s1.hashCode());
		System.out.println("s2 hash code::"+s2.hashCode());
		
		if(s1==s2)
		{
			System.out.println("s1 and s2 Both Are Pointing to same Object So (This iS a SingleTon Class)");
		}
		else
		{
			System.out.println("Not a singleTon Class");
		}
	}

}
