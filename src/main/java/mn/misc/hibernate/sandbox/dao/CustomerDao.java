package mn.misc.hibernate.sandbox.dao;

import mn.misc.hibernate.sandbox.model.Customer;

import java.util.List;

public interface CustomerDao {

    List<Customer> findAllCustomers();
    List<Customer> findAllCustomersLike(String query);
}
