package pl.coderslab.homeDay3.Config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.coderslab.homeDay3.SimpleCustomerLogger;

public class SpringDiApplication {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);


        SimpleCustomerLogger logger = context.getBean("logger",SimpleCustomerLogger.class);

        logger.log();
    }
}
