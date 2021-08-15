package model;

import java.util.List;
import java.util.UUID;

public class Movie  {

    private UUID id;
    private String name;
    private Genre genre;
    private Person director;
    private List<Person> actors;

    public Movie() {

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Person getDirector() {
        return director;
    }

    public void setDirector(Person director) {
        this.director = director;
    }

    public List<Person> getActors() {
        return actors;
    }

    public void setActors(List<Person> actors) {
        this.actors = actors;
    }

    public void addActor(Person actor) {
        this.actors.add(actor);
    }

    public void removeActor(Person actor) {
        this.actors.remove(actor);
    }

}
