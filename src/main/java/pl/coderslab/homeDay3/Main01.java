package pl.coderslab.homeDay3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.coderslab.homeDay3.Config.AppConfiguration;
import pl.coderslab.homeDay3.model.Customer;
import pl.coderslab.homeDay3.service.MemoryCustomerRepository;
import pl.coderslab.homeDay3.service.SimpleCustomerLogger;

import java.util.ArrayList;
import java.util.List;


public class Main01 {
public static List<Customer> list = new ArrayList<>();


    public static void main(String[] args) {


        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);


        SimpleCustomerLogger logger = context.getBean(SimpleCustomerLogger.class);
        logger.log();

        MemoryCustomerRepository repository = context.getBean("repository",MemoryCustomerRepository.class);

        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("Jaro");
        customer.setSurname("Fetsiura");

        Customer customer2 = new Customer();
        customer2.setId(2);
        customer2.setName("Julia");
        customer2.setSurname("Kruchkovska");

        repository.addCustomer(customer);
        repository.addCustomer(customer2);

        repository.customersList();
        System.out.println("-----------------");
        repository.delete(2);
        repository.customersList();


    }
}
