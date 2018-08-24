package pl.com.sages.webapp.jpa;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Component
@Path("/hello")
public class HelloWorld {

    @GET
    @Path("/world")
    public String sayHello(){
        return "Hello world from REST!";
    }
}
