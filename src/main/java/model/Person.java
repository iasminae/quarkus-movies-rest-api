package model;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class Person extends PanacheEntity {
    public String name;
    public String biography;
    public String photoURL;
}
