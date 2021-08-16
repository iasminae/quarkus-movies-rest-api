package model;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;
import io.quarkus.hibernate.reactive.panache.PanacheEntityBase;

import javax.persistence.*;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.util.List;

@Entity
public class Movie extends PanacheEntity {

    @Column(length = 40, unique = false)
    public String title;
    @Enumerated(EnumType.STRING)
    public Genre genre;
    @ElementCollection(targetClass=Person.class)
    @OneToMany(fetch = FetchType.EAGER)
    public List<Person> actors;

    public Movie() {
    }

    public void addActor(Person actor) {
        this.actors.add(actor);
    }
    public void removeActor(Person actor) {
        this.actors.remove(actor);
    }

}
