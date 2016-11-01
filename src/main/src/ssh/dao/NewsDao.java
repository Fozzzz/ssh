package ssh.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ssh.entity.News;
import ssh.entity.Order;

import java.util.List;

/**
 * Created by Administrator on 2016/11/1.
 */
@Component
public class NewsDao {
    @Autowired
    private SessionFactory sessionFactory;
    public void add(News news) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(news);
        session.getTransaction().commit();
    }
    public void delete(int id) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        News news = session.get(News.class, id);
        session.delete(news);
        session.getTransaction().commit();
    }
    public void edit(News news) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.saveOrUpdate(news);
        session.getTransaction().commit();
    }
    public List<News> get(int first, int max, String type) {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from News n where n.type=:type").setParameter("type", type);
        query.setFirstResult(first).setMaxResults(max);
        List<News> list = query.list();
        return list;
    }
}
