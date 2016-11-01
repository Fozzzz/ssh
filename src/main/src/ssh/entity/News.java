package ssh.entity;

import java.util.Date;

/**
 * Created by Administrator on 2016/11/1.
 */
public class News {
    private Integer id;
    private String name;
    private String content;
    private String type;

    public News() {
    }

    public News(Integer id, String name, String content, String type) {
        this.id = id;
        this.name = name;
        this.content = content;
        this.type = type;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
