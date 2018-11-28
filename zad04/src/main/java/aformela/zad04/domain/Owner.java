package aformela.zad04.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Owner {

    private Long id;
    private String name;

    private List<Bird> birdList = new ArrayList<Bird>();

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return name;
    }

    public void setFirstName(String firstName) {
        this.name = firstName;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public List<Bird> getBirdList() {
        return birdList;
    }

    public void setDogList(List<Bird> birdList) {
        this.birdList = birdList;
    }
}
