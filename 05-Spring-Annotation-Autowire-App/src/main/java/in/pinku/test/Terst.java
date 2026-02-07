package in.pinku.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.pinku.cfg.AppConfig;
import in.pinku.service.ReportService;

public class Terst {

	public static void main(String[] args) {
		
		ApplicationContext c=new AnnotationConfigApplicationContext(AppConfig.class);
		ReportService service=c.getBean(ReportService.class);
       service.gererate();
	}

}
