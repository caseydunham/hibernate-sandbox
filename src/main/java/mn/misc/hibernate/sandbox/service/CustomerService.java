package mn.misc.hibernate.sandbox.service;

import mn.misc.hibernate.sandbox.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAllCustomers();
    List<Customer> findAllCustomersLike(String query);
}
