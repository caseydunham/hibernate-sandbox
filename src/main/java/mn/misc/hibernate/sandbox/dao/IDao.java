package mn.misc.hibernate.sandbox.dao;

import mn.misc.hibernate.sandbox.model.IValueObject;
import org.hibernate.Criteria;

public interface IDao<T extends IValueObject> {
    T getById(Long id);
    void persist(T entity);
    void delete(T entity);
    void saveOrUpdate(T entity);
    Criteria createEntityCriteria();
}
