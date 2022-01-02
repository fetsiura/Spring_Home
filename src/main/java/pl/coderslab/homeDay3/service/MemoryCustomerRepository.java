package pl.coderslab.homeDay3.service;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import pl.coderslab.homeDay3.model.Customer;

import java.util.ArrayList;
import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
public class MemoryCustomerRepository implements CustomerRepository{
    private List<Customer> customers = new ArrayList<>();
    private SimpleCustomerLogger logger;

    public MemoryCustomerRepository(CustomerLogger logger) {
        logger.log();
    }

    @Override
    public void addCustomer(Customer customer) {
        logger.log();
        this.customers.add(customer);
    }

    @Override
    public void delete(long id) {
        Customer customer1 = customers.stream()
                .filter(customer -> customer.getId() == id).findFirst().get();

        customers.remove(customer1);
        logger.log();

    }

    @Override
    public void customersList() {
        logger.log();

        customers.forEach(System.out::println);
    }
}
