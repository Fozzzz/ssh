package ssh.entity;

/**
 * Created by Administrator on 2016/11/1.
 */
public class Orders {
    /***
     * 购票人
     */
    private Integer id;
    private String username;
    private String phone;

    /***
     * 购物商品内容id数量  1+3 2+2
     */
    private String cars;
    /**
     * 订单状态
     */
    private String status;

    public Orders() {
    }

    public Orders(Integer id, String username, String phone, String cars, String status) {
        this.id = id;
        this.username = username;
        this.phone = phone;
        this.cars = cars;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCars() {
        return cars;
    }

    public void setCars(String cars) {
        this.cars = cars;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
