package in.pinku.utill;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import in.pinku.binding.Person;

public class MarshallDemo {

	public static void main(String[] args) throws Exception {
		
		Person p=new Person();
		p.setId(1);
		p.setName("pinku");
		p.setSalary(55000);
		p.setAge(23);
		
		JAXBContext context = JAXBContext.newInstance(Person.class);
		Marshaller mar = context.createMarshaller();
		mar.marshal(p, new File("person.xml"));
		System.out.println("Done....");
	}
}
