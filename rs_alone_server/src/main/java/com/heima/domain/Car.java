package com.heima.domain;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * xuan
 * 2017/12/27
 */
@XmlRootElement(name = "car")
public class Car {
    private Integer id;
    private Double money;
    private String brand;

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", money=" + money +
                ", brand='" + brand + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
