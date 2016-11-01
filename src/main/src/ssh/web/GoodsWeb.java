package ssh.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ssh.dao.GoodDao;
import ssh.entity.Goods;

import java.util.ArrayList;
import java.util.List;

/**
 * 显示商品的信息
 * Created by Administrator on 2016/11/1.
 */
@Controller
@RequestMapping("/goods")
public class GoodsWeb {
    @Autowired
    private GoodDao goodDao;
    @RequestMapping("/showGoods")
    public @ResponseBody
    List<Goods> showGoods(){
        List<Goods> goodsList=goodDao.get(0,20);
        return goodsList;
    }
}
