package com.heima.publish;

import com.heima.domain.Car;
import com.heima.domain.User;
import com.heima.server.UserServiceImpl;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

/**
 * xuan
 * 2017/12/27
 */
public class MyPublish {
    public static void main(String[] args) {
        JAXRSServerFactoryBean factoryBean = new JAXRSServerFactoryBean();
        //发现下面这行代码没意义
//        factoryBean.setResourceClasses(User.class, Car.class);
        factoryBean.setServiceBean(new UserServiceImpl());
        factoryBean.setAddress("http://localhost:8081");

        factoryBean.getInInterceptors().add(new LoggingInInterceptor());
        factoryBean.getOutInterceptors().add(new LoggingOutInterceptor());
        factoryBean.create();
    }
}
