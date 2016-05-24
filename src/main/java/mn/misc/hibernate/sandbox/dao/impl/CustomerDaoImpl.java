package mn.misc.hibernate.sandbox.dao.impl;

import mn.misc.hibernate.sandbox.dao.AbstractDao;
import mn.misc.hibernate.sandbox.dao.CustomerDao;
import mn.misc.hibernate.sandbox.model.Customer;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository("customerDao")
public class CustomerDaoImpl extends AbstractDao<Customer> implements CustomerDao {

    @SuppressWarnings("unchecked")
    public List<Customer> findAllCustomers() {
        Criteria criteria = createEntityCriteria();
        return (List<Customer>) criteria.list();
    }

    @Override
    public List<Customer> findAllCustomersLike(String query) {
        Session session = getSession();
        String hql = "from Customer c where c.name like '%" + query + "%'";
        Query q = session.createQuery(hql);
        return (List<Customer>) q.list();
    }
}
