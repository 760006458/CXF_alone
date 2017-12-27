package com.heima.client;

import com.heima.domain.User;
import org.apache.cxf.jaxrs.client.WebClient;

import javax.ws.rs.core.MediaType;

/**
 * xuan
 * 2017/12/27
 */
public class ClientTest {
    public static void main(String[] args) {
        User user = WebClient.create("http://localhost:8081/userService/getUserById/1")
                .type(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .get(User.class);
        System.out.println(user);
    }
}
