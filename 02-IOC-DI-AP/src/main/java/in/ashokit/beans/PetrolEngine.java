package in.ashokit.beans;

public class PetrolEngine implements IEngine
{

	
	public PetrolEngine()
	{
		System.out.println("Petrol CVonstructor Strted...");
	}

	@Override
	public int start()
	{
		System.out.println("PetrolEngine Strted....");
		return 1;
	}

}
