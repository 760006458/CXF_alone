package heima.server;

import heima.domain.User;

import javax.ws.rs.*;
import java.util.List;

/**
 * xuan
 * 2017/12/27
 */
@Path("/userService")
public interface UserService {
    @GET
    @Path("/getUserById/{id}")
    @Consumes("application/json")
    @Produces("application/json")
    public User getUserById(@PathParam("id") Integer id);
    public List<User> getAllUsers();
}
