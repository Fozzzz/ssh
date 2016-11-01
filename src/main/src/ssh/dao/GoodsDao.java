package ssh.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ssh.entity.Goods;

import java.util.List;

/**
 * Created by Administrator on 2016/11/1.
 */
@Component
public class GoodsDao {
    @Autowired
    private SessionFactory sessionFactory;
    public void add(Goods goods) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(goods);
        session.getTransaction().commit();
    }
    public void delete(int id) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Goods goods = session.get(Goods.class, id);
        session.delete(goods);
        session.getTransaction().commit();
    }
    public void edit(Goods goods) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.saveOrUpdate(goods);
        session.getTransaction().commit();
    }
    public List<Goods> get(int first,int max) {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from Goods");
        query.setFirstResult(first).setMaxResults(max);
        List<Goods> list = query.list();
        return list;
    }
}
