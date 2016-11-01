package ssh.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import ssh.dao.NewsDao;
import ssh.entity.News;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/11/1.
 */
@Controller("/mainController")
public class NewsWeb {
    @Autowired
    private NewsDao newsDao;

    public @ResponseBody
    List<News> showNews(String type){
        List<News> newsList =new ArrayList<News>();
        newsList =newsDao.get(0,4,type);
        return newsList;
    }
}
