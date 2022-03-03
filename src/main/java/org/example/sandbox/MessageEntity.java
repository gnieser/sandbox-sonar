package org.example.sandbox;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;

@Entity
@Table(name = "MESSAGE")
public class MessageEntity extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false, updatable = false)
    private Long id;

    @Column(name = "MESSAGE")
    private String message;

    public Long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

}
