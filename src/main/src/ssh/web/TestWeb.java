package ssh.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ssh.dao.TestDao;

/**
 * Created by Administrator on 2016/10/31.
 */
@Controller
public class TestWeb {
    @Autowired
    private TestDao testDao;
    @RequestMapping("test")
    public @ResponseBody String test(){
        testDao.add();
        return "index";
    }
}
