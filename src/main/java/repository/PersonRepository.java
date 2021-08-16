package repository;

import io.quarkus.hibernate.reactive.panache.PanacheRepository;
import model.Person;

import io.smallrye.mutiny.Uni;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PersonRepository implements PanacheRepository<Person> {

    public Uni<Person> findByName(String name){
        return find("name", name).firstResult();
    }

}
