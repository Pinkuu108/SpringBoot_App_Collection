package Interview_Related_Code;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Emp
{
	String name;
	String dept;
	Double salary;
	public Emp(String name, String dept, double i) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = i;
	}
	public String getName() {
		return name;
	}
	public String getDept() {
		return dept;
	}
	public Double getSalary() {
		return salary;
	}
	
	
}
public class Daily_Reuse_Practice_Code {
    public static void main(String[] args) {
    	
    	List<Emp> emp=Arrays.asList(
    			new Emp("Pk", "It", 67000),
    			new Emp("Ck", "NonIt", 45000),
    			new Emp("Mom", "NonIt", 50000),
    			new Emp("Dad", "Business", 90000),
    			new Emp("Didi", "It", 66000));
		 Map<String,Emp> map = emp.stream().collect(Collectors.groupingBy(Emp::getDept
				 ,Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Emp::getSalary))
						 ,Optional::get
						 ))
				 
				 
				 
				 );
         System.out.println(map);
        
    }
}
