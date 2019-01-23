package com.example.shdemo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;



@NamedQueries({
		@NamedQuery(name = "toy.findAll", query = "Select t from Toy t"),
		@NamedQuery(name = "toy.findById", query = "Select t from Toy t where t.id = :id")
})
@Entity
public class Toy {

    private Long id;
    private String name;
    @ManyToOne
    private Bird bird;
    public Toy(String name) {
		this.name = name;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}