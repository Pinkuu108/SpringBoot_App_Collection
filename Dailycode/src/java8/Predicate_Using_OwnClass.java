package java8;
import java.util.ArrayList;
import java.util.function.Predicate;


class Emplloyee {
	String name;
	Long salary;
	public Emplloyee(String name, long salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

}
public class Predicate_Using_OwnClass {

	public static void main(String[] args) {
		
		ArrayList<Emplloyee> l= new ArrayList<Emplloyee>();
		l.add(new Emplloyee("pinkuna", 15000));
		l.add(new Emplloyee("chinu", 18000));
		l.add(new Emplloyee("lizun", 23000));
		l.add(new Emplloyee("pintu", 33000));
		l.add(new Emplloyee("bidyut", 16000));
	    Predicate<Emplloyee> pp=e->e.salary>15000;
	    for(Emplloyee s1:l)
	    {
	    	if(pp.test(s1))
	    	{
	    		System.out.println(s1.name+":"+s1.salary);
	    	}
	    }

	}

}
