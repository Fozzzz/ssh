package src.ssh.entity;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ssh.dao.NewsDao;
import ssh.entity.News;

import java.util.List;

/**
 * Created by Administrator on 2016/11/1.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
public class TestNews {
    @Autowired
    private NewsDao newsDao;
    @Test
    public void testGet(){
        List<News> newsList = newsDao.get(0, 4, "景区新闻");
       Assert.assertNotNull(newsList);
    }
}
