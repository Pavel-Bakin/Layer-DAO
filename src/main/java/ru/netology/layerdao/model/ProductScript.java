package ru.netology.layerdao.model;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
public class ProductScript {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String script;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

