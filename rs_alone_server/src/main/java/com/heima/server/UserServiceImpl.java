package com.heima.server;

import com.heima.domain.Car;
import com.heima.domain.User;

import java.util.ArrayList;
import java.util.List;

/**
 * xuan
 * 2017/12/27
 */
public class UserServiceImpl implements UserService {
    public User getUserById(Integer id) {
        //用户1
        User user = new User();
        user.setId(1);
        user.setName("张三");

        Car car1 = new Car();
        car1.setId(1);
        car1.setBrand("大众");
        car1.setMoney(20000d);

        Car car2 = new Car();
        car2.setId(2);
        car2.setBrand("奔驰");
        car2.setMoney(500000d);

        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        user.setCars(cars);

        //用户2
        User user2 = new User();
        user2.setId(2);
        user2.setName("李四");

        Car car3 = new Car();
        car3.setId(3);
        car3.setBrand("奥迪");
        car3.setMoney(300000d);

        Car car4 = new Car();
        car4.setId(4);
        car4.setBrand("宝马");
        car4.setMoney(400000d);

        List<Car> cars2 = new ArrayList<>();
        cars2.add(car3);
        cars2.add(car4);
        user2.setCars(cars2);

        if (id == 1){
            return user;
        }else if (id == 2){
            return user2;
        }
        return null;
    }

    public List<User> getAllUsers() {
        User user = new User();
        user.setId(1);
        user.setName("张三");

        Car car1 = new Car();
        car1.setId(1);
        car1.setBrand("大众");
        car1.setMoney(20000d);

        Car car2 = new Car();
        car2.setId(2);
        car2.setBrand("奔驰");
        car2.setMoney(500000d);

        List<Car> cars = new ArrayList<>();
        user.setCars(cars);

        User user2 = new User();
        user2.setId(2);
        user2.setName("李四");

        Car car3 = new Car();
        car3.setId(3);
        car3.setBrand("奥迪");
        car3.setMoney(300000d);

        Car car4 = new Car();
        car4.setId(4);
        car4.setBrand("宝马");
        car4.setMoney(400000d);

        List<Car> cars2 = new ArrayList<>();
        user2.setCars(cars2);

        List<User> users = new ArrayList<>();
        users.add(user);
        users.add(user2);
        return users;
    }
}
