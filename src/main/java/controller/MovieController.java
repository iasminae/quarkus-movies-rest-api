package controller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/movies")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MovieController {

    @GET
    public String getAllMovies() {
        return "Wow, this is gonna be a lot of movies";
    }

    @GET
    @Path("/genre/{genre}")
    public String getMoviesByGenre(String genre) {
        return "Wow, this is gonna be a lot of movies";
    }

    @GET
    @Path("/director/{director}")
    public String getMoviesByDirector(String director) {
        return "Wow, this is gonna be a lot of movies";
    }

    @GET
    @Path("/{title}")
    public String getMovie(String title) {
        return "Wow, this is gonna be a lot of movies";
    }

    @POST
    @Path("/{title}")
    public String addMovie(String title) {
        return "Wow, this is gonna be a lot of movies";
    }

    @DELETE
    @Path("/{title}")
    public String deleteMovie(String title) {
        return "Wow, this is gonna be a lot of movies";
    }

}
