package in.pinku.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.pinku.beans.Appconfig;

public class MainApp {

	public static void main(String[] args) {
//		ApplicationContext c=new ClassPathXmlApplicationContext("Beans.xml");
		
		ApplicationContext c=new AnnotationConfigApplicationContext(Appconfig.class);
		
		
	}

}
