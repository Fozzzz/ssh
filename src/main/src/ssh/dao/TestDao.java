package ssh.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import ssh.entity.User;

/**
 * Created by Administrator on 2016/10/31.
 */
@Component
public class TestDao {
    @Autowired
    private SessionFactory sessionFactory;
    public void add() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        User user = new User(null,"test");
        session.persist(user);
        System.out.println("add()");
        session.getTransaction().commit();
    }
}
