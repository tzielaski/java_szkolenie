package pl.com.sages.webapp.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Component
@Path("/hello")

public class HelloWorld {
@Autowired
EmployeeRepository employeeRepository;

    @GET
    @Path("/world")
    public String sayHello(){
        return "Hello world from REST!";
    }

    @GET
    @Path("/employees")
    public String printEmployees(){
        Employee michail = new Employee( "" + "Michail","Cheshlakov");
        employeeRepository.save(michail);
        employeeRepository.save(new Employee("Misza","Stopienko"));
        StringBuilder stringBuilder = new StringBuilder();
        for(Employee employee: employeeRepository.findAll()){
            stringBuilder.append(employee.getId());
            stringBuilder.append(": " + employee.toString() + "\n");
        }
        return stringBuilder.toString();
    }
}
