package ssh.service;

import java.util.Random;

/**
 * Created by Administrator on 2016/11/1.
 */
public class GetOrdersid {
    public static String getOrdersid(){
        String id;
        Random r = new Random();

        id = System.nanoTime() + "" + r.nextInt();


        return id;
    }

}
