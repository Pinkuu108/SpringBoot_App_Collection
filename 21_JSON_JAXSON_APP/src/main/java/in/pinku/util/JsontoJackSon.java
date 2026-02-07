package in.pinku.util;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import in.pinku.bindings.Passengers;

public class JsontoJackSon {
	public static void main(String[] args) throws Exception{
		Passengers p=new Passengers();
		p.setId(108);
		p.setName("pinkuna");
		p.setCity("bhadrak");
		p.setAge(23);
		
		ObjectMapper obj=new ObjectMapper();
		obj.writeValue(new File("Passengers.json"), p);
	}

}
