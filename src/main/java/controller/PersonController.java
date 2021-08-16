package controller;

import io.smallrye.mutiny.Uni;
import model.Person;
import repository.PersonRepository;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/people")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PersonController {

    @Inject
    PersonRepository personRepository;

    @GET
    @Path("/{name}")
    public Uni<Person> getPerson(@PathParam("name") String name) {
        return personRepository.findByName(name);
    }
}
