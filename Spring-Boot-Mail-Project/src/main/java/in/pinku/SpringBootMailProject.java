package in.pinku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.pinku.service.IpurchaseOrder;

@SpringBootApplication
public class SpringBootMailProject {

    public static void main(String[] args) {
        // Start Spring Boot application
        ApplicationContext ctx = SpringApplication.run(SpringBootMailProject.class, args);

        // Get service bean directly by interface type (no name needed)
        IpurchaseOrder order = ctx.getBean(IpurchaseOrder.class);

        try {
            // Call mail sending method
            String status = order.sendMail(new String[] {
                "pinkunaprusty2003@gmail.com",
                "chinmayeesahoo382@gmail.com"
               
            });

            System.out.println(status);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Close the context
        ((ConfigurableApplicationContext) ctx).close();
    }
}
