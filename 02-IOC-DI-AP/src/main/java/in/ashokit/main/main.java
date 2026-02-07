package in.ashokit.main;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ashokit.beans.Car;

public class main {

	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		
		Car car = context.getBean("Car",Car.class);
         car.drive();
      //BeanFactory f = new XmlBeanFactory(new ClassPathResource("Beans.xml"));
	 //	ApplicationContext c=new ClassPathXmlApplicationContext("Beans.xml");
         

	}

}
