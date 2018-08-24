package pl.com.sages.webapp.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.Optional;


@Component
@Path("/employee")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GET
    @Produces("application/json")
    @Path("/all")
    public Iterable<Employee> getAll() {
        return employeeRepository.findAll();
    }

    @GET
    @Path("/{id}")
    @Produces("application/json")
    public Employee getById(@PathParam("id") long id) {
        Optional<Employee> optionalEmployee = employeeRepository.findById(id);
        return (optionalEmployee.isPresent() ? optionalEmployee.get() : new Employee());
    }


    @POST
    @Path("/add")
    @Consumes("application/json")
    public Response addEmployee(Employee employee){
        employeeRepository.save(employee);
        return Response.ok().build();
    }
}
