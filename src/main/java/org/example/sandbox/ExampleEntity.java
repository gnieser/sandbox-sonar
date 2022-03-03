package org.example.sandbox;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "EXAMPLE")
public class ExampleEntity extends PanacheEntity {

    @Column(name = "EXAMPLE")
    private String example;

    public String getExample() {
        return example;
    }

}
