package ssh.entity;

/**
 * Created by Administrator on 2016/11/1.
 */
public class Goods {
    private Integer id;
    private String name;
    private String content;
    private Integer price;

    public Goods() {
    }

    public Goods(Integer id, String name, String content, Integer price) {
        this.id = id;
        this.name = name;
        this.content = content;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
