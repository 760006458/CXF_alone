package heima.domain;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * xuan
 * 2017/12/27
 */
@XmlRootElement(name = "user")  //注：哪怕客户端输送和接收的都是json，此处也需要加此注解
public class User {
    private Integer id;
    private String name;
    private List<Car> cars;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cars=" + cars +
                '}';
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

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
