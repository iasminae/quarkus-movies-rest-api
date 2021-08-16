package controller;

import model.Genre;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Arrays;
import java.util.List;

@Path("/genres")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class GenreController {
    @GET
    public List<Genre> getAllGenres() {
        return  Arrays.asList(Genre.values());
    }

    @GET
    @Path("/{genre}")
    public String getGenreDescription(@PathParam("genre") String genre) {
        return Genre.valueOf(genre).getDescription();
    }
}
