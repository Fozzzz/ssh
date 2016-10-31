package ssh.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2016/10/31.
 */
@Controller
public class TestWeb {
    @RequestMapping("test")
    public String test(){
        return "index";
    }
}
