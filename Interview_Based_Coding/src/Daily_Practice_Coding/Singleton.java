package Daily_Practice_Coding;

public class Singleton {
	
	private static Singleton instance;
	
	private Singleton()
	{
	 System.out.println("Singleton.Singleton()");
	}
	private static Singleton getsingle()
	{
		if(instance==null)
		{
			instance= new Singleton();
		}
		return instance;
	}
	public static void main(String[] args) {
		
		Singleton t=Singleton.getsingle();
		Singleton p=Singleton.getsingle();
		if(t.equals(p))
		{
			System.out.println("True");
		}
		
	}

}
