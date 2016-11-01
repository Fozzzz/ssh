package ssh.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ssh.dao.GoodsDao;
import ssh.entity.Goods;

import java.util.List;

/**
 * Created by Administrator on 2016/11/1.
 */
@Component
@RequestMapping("/goods")
public class GoodsWeb {
    @Autowired
    private GoodsDao goodsDao;
    @RequestMapping("/get")
    public @ResponseBody List<Goods> get(){
        return goodsDao.get(0, 5);
    }
    @RequestMapping("/delete")
    public @ResponseBody String delete(Integer id){
        goodsDao.delete(id);
        return "ok";
    }
    @RequestMapping("/update")
    public @ResponseBody String update(Goods goods){
        goodsDao.edit(goods);
        return "ok";
    }
    @RequestMapping("/post")
    public String post(Goods goods){
        goodsDao.add(goods);
        return "back/ok";
    }
}
