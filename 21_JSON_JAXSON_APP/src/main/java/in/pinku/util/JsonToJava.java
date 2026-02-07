package in.pinku.util;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.pinku.bindings.Passengers;

public class JsonToJava {
	public static void main(String[] args) throws Exception {
		ObjectMapper or=new ObjectMapper();
       Passengers l = or.readValue(new File("Passengers.json"), Passengers.class);
       System.out.println(l);
	}

}
