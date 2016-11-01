package ssh.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ssh.entity.Orders;

import java.util.List;

/**
 * Created by Administrator on 2016/11/1.
 */
@Component
public class OrderDao {
    @Autowired
    private SessionFactory sessionFactory;
    public void add(Orders orders) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(orders);
        session.getTransaction().commit();
    }
    public void delete(int id) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Orders orders = session.get(Orders.class, id);
        session.delete(orders);
        session.getTransaction().commit();
    }
    public void edit(Orders orders) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.saveOrUpdate(orders);
        session.getTransaction().commit();
    }
    public List<Orders> get(int first, int max, String type) {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from Order");
        query.setFirstResult(first).setMaxResults(max);
        List<Orders> list = query.list();
        return list;
    }
}
