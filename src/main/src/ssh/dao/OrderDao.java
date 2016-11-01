package ssh.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ssh.entity.Goods;
import ssh.entity.Order;

import java.util.List;

/**
 * Created by Administrator on 2016/11/1.
 */
@Component
public class OrderDao {
    @Autowired
    private SessionFactory sessionFactory;
    public void add(Order order) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(order);
        session.getTransaction().commit();
    }
    public void delete(int id) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Order order = session.get(Order.class, id);
        session.delete(order);
        session.getTransaction().commit();
    }
    public void edit(Order order) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.saveOrUpdate(order);
        session.getTransaction().commit();
    }
    public List<Order> get(int first,int max,String type) {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from Order");
        query.setFirstResult(first).setMaxResults(max);
        List<Order> list = query.list();
        return list;
    }
}
