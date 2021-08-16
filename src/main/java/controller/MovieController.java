package controller;

import io.smallrye.mutiny.Uni;
import model.Genre;
import model.Movie;
import repository.MovieRepository;
import javax.inject.Inject;

import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/movies")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MovieController {

    @Inject
    MovieRepository movieRepository;

    @GET
    public Uni<List<Movie>> getAllMovies() {
        //return Movie.listAll(); -- this also works
        return movieRepository.findAllMovies();
    }

    @GET
    @Path("/genre/{genre}")
    public Uni<List<Movie>> getMoviesByGenre(@PathParam("genre") Genre genre) {
        return movieRepository.findByGenre(genre);
    }

    @GET
    @Path("/director/{director}")
    public String getMoviesByDirector(String director) {
        return "Wow, this is gonna be a lot of movies";
    }

    @GET
    @Path("/{title}")
    public Uni<Movie> getMovie(@PathParam("title") String title) {
        return movieRepository.findByTitle(title);
    }

    @POST
    @Transactional
    public Uni<Movie> addMovie(Movie movie) {
        // return Movie.persist(movie); -- this also works
        return movieRepository.persist(movie);
    }

    @DELETE
    @Transactional
    public Uni<Void> deleteMovie(Movie movie) {
        return movieRepository.delete(movie);
    }

}
