package ssh.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import ssh.dao.OrderDao;
import ssh.entity.Orders;

import javax.servlet.http.HttpSession;


/**
 * Created by Administrator on 2016/11/1.
 */
@Controller
@RequestMapping("/order")

public class OrdersWeb {
    @Autowired
    private OrderDao orderDao;


    @RequestMapping("/addcars")
    public @ResponseBody
    String addOrders(String cars, HttpSession session){

        String cars1= (String) session.getAttribute("cars");
        if (cars1==null){
            cars1=cars;
        }else {
            cars1=cars1+" "+cars;
        }
        session.setAttribute("cars",cars1);
      return cars1;
    }


    @RequestMapping("/updatecars")
    public @ResponseBody
    String updateOrders(HttpSession session){

       String cars= (String) session.getAttribute("cars");
        return cars;
    }
    @RequestMapping("/subcars")
    public @ResponseBody
    String subOrders(String cars,HttpSession session){
        session.setAttribute("cars",cars);
        return cars;
    }

    @RequestMapping("/subOrders")
    public @ResponseBody
    String subOrders(Orders orders,HttpSession session){
        String cars= (String) session.getAttribute("cars");
        orders.setCars(cars);
        orderDao.add(orders);
        return cars;
    }
}
