package pl.coderslab.homeDay3.service;

import pl.coderslab.homeDay3.model.Customer;

import java.util.List;

public interface CustomerRepository {

    void addCustomer(Customer customer);
    void delete(long id);
    void customersList();
}
