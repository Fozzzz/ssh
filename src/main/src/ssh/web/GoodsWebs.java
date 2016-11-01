package ssh.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ssh.dao.TestDao;

/**
 * Created by Administrator on 2016/11/1.
 */
@Component
public class GoodsWebs {
    @Autowired
    private TestDao testDao;
    @RequestMapping("test")
    public @ResponseBody
    String test(){
        testDao.add();
        return "index";
    }
}
