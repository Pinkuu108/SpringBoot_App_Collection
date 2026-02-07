package in.ashokit.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Motor implements InitializingBean,DisposableBean {

	//XmlaPROACH
//	public Motor() {
//		System.out.println("Motoer:: Constructor");
//
//	}
//
//	public void start() {
//		System.out.println("MOtor Started....");
//	}
//
//	public void doWork() {
//		System.out.println("Motor Pulling Water....");
//	}
//
//	public void stop() {
//		System.out.println("Motor stoped.....");
	
	public  Motor() 
	{
		System.out.println("MOTOR::CONSTRUCTOR");
	}
	
	

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Motor.afterPropertiesSet()");
		
	}
	public void doWork() 
	{
	System.out.println("Motor Pulling Water....");
	
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Motor.destroy()");
		
	}

	
	
}

	


