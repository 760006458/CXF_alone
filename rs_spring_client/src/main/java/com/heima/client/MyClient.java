package com.heima.client;

import com.heima.domain.User;
import org.apache.cxf.jaxrs.client.WebClient;

import javax.ws.rs.core.MediaType;

/**
 * xuan
 * 2017/12/30
 */
public class MyClient {
    public static void main(String[] args) {
        User user = WebClient.create("http://localhost:8080/rs_spring_server/path1/path2/userService/getUserById/1")
                .accept(MediaType.APPLICATION_JSON).get(User.class);
        System.out.println(user);
    }
}
