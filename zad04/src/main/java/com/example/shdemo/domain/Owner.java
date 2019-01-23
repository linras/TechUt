package com.example.shdemo.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
	@NamedQuery(name = "owner.findAll", query = "Select o from Owner o"),
	@NamedQuery(name = "owner.findById", query = "Select o from Owner o where o.id = :id")
})
public class Owner {

    private Long id;
    private String name;

    private List<Bird> birdList = new ArrayList<Bird>();

    public Owner() {
		super();
	}
    
    public Owner(String name) {
		super();
		this.name = name;
	}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(nullable = false)
    public String getFirstName() {
        return name;
    }

    public void setFirstName(String firstName) {
        this.name = firstName;
    }

    //@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @ManyToMany
    public List<Bird> getBirdList() {
        return birdList;
    }

    public void setBirdList(List<Bird> birdList) {
        this.birdList = birdList;
    }

	
    
}