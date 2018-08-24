package pl.com.sages.webapp.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.Optional;

@Component
@Path("/book")
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @GET
    @Produces("application/json")
    @Path("/all")
    public Iterable<Book> getAll(){
        return bookRepository.findAll();
    }

    @GET
    @Path("/{id}")
    @Produces("application/json")
    public Book getById(@PathParam("id") long id){
        Optional<Book> bookOptional = bookRepository.findById(id);
        return(bookOptional.isPresent()? bookOptional.get() : new Book());
    }

    @POST
    @Consumes("application/json")
    public Response addBook(Book book){
        bookRepository.save(book);
        return Response.ok().build();
    }
}
