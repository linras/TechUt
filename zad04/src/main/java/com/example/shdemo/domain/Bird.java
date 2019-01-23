package com.example.shdemo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;



@Entity
@NamedQueries({
	@NamedQuery(name = "bird.findAll", query = "Select b from Bird b"),
	@NamedQuery(name = "bird.findById", query = "Select b from Bird b where b.id = :id"),
	@NamedQuery(name = "bird.findByName", query = "Select b from Bird b where b.name = :name"),
	@NamedQuery(name= "bird.findBirdToys", query= "Select b.toyList from Bird b where b.id = :id")
})

public class Bird {

	private String name;
	private boolean isFemale;
	private double weight;
	private Date  dateOfBirth;
	private int countOfColors;
    private List<Toy> toyList = new ArrayList<Toy>();
    private List<Owner> owners = new ArrayList<Owner>();
    private Tail tail;
	
	
	public Bird() {
		super();
	}

	private Long id; 
	public Bird(String name, Date dateOfBirth, boolean isFemale, double weight, int countOfColors) {
		super();
		this.name = name;
		this.isFemale = isFemale;
		this.weight = weight;
		this.dateOfBirth = dateOfBirth;
		this.countOfColors = countOfColors;
	}

	public Bird(Long id, String name, Date dateOfBirth, boolean isFemale, double weight, int countOfColors) {
		super();
		this.id = id;
		this.name = name;
		this.isFemale = isFemale;
		this.weight = weight;
		this.dateOfBirth = dateOfBirth;
		this.countOfColors = countOfColors;
	}
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Bird(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isFemale() {
		return isFemale;
	}
	public void setFemale(boolean isFemale) {
		this.isFemale = isFemale;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public int getCountOfColors() {
		return countOfColors;
	}

	public void setCountOfColors(int countOfColors) {
		this.countOfColors = countOfColors;
	}
	
	//@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public List<Toy> getToyList() {
        return toyList;
    }

    public void setToyList(List<Toy> toyList) {
        this.toyList = toyList;
    }
	
    @OneToOne(fetch = FetchType.LAZY)
    public Tail getTail() {
        return tail;
    }
    
    @ManyToMany
	public List<Owner> getOwners() {
		return owners;
	}
    
    public void setOwners(List<Owner> owners) {
		this.owners = owners;
	}

    public void setTail(Tail tail) {
        this.tail = tail;
    }
	

	@Override
	public String toString() {
		return "Bird [name=" + name + ", isFemale=" + isFemale + ", weight=" + weight + ", dateOfBirth=" + dateOfBirth
				+ ", countOfColors=" + countOfColors + ", id=" + id + "]";
	}
	
}