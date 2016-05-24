package mn.misc.hibernate.sandbox.service.impl;

import mn.misc.hibernate.sandbox.dao.CustomerDao;
import mn.misc.hibernate.sandbox.model.Customer;
import mn.misc.hibernate.sandbox.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("customerService")
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao dao;

    @Override
    public List<Customer> findAllCustomers() {
        return dao.findAllCustomers();
    }

    @Override
    public List<Customer> findAllCustomersLike(String query) {
        return dao.findAllCustomersLike(query);
    }
}
