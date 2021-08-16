package repository;

import io.quarkus.hibernate.reactive.panache.PanacheQuery;
import io.quarkus.hibernate.reactive.panache.PanacheRepository;
import io.smallrye.mutiny.Uni;
import model.Genre;
import model.Movie;

import javax.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class MovieRepository implements PanacheRepository<Movie> {

    public Uni<Movie> findByTitle(String title) {
        return find("title", title).firstResult();
    }

    public Uni<List<Movie>> findByGenre(Genre genre) {
        return find("genre", genre).list();
    }

    public Uni<List<Movie>> findAllMovies() {
        return Movie.listAll();
    }
}
