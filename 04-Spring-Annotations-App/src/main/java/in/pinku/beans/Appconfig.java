package in.pinku.beans;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Appconfig {

	public Appconfig() {
		System.out.println("Appconfigure::Constructor");
	}
}
