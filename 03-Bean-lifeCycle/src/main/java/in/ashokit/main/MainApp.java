package in.ashokit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ashokit.beans.Motor;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext c=new ClassPathXmlApplicationContext("Spring-Beans.xml");
		
		
		Motor motor=c.getBean(Motor.class);
		motor.doWork();
		
		ConfigurableApplicationContext cfgctxt=(ConfigurableApplicationContext)c;
		cfgctxt.registerShutdownHook();
//		cfgctxt.stop();
		

	}

}
