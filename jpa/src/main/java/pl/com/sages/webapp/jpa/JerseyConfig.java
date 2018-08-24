package pl.com.sages.webapp.jpa;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig(){
        register(HelloWorld.class);
        register(EmployeeController.class);
    }
}
