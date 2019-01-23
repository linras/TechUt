package com.example.shdemo.service;

import java.util.List;

import com.example.shdemo.domain.Bird;
import com.example.shdemo.domain.Owner;
import com.example.shdemo.domain.Tail;
import com.example.shdemo.domain.Toy;

public interface BirdManager {
	void addBird(Bird bird);
	List<Bird> getAllBirds();
	void deleteBird(Bird bird);
	Bird findBirdByName(String name);
	Bird findBirdById(Long id);
	
	void addOwner(Owner owner);
    void deleteOwner(Owner owner);
    Owner findOwnerById(Long id);
	List<Owner> getAllOwners();
	List <Bird> getOwnerBirds(Owner owner);

    void addToy(Toy toy);
    void deleteToy(Toy toy);
    Toy findToyById(Long id);
    List<Toy> getAllToys();
    List<Toy> findBirdToys(Bird bird);

    void addTail(Tail tail);
    void deleteTail(Tail tail);
    Tail findTailById(Long id);
    List<Tail> getAllTails();
	

	void addBirdToOwner(Bird b, Owner o);
	void removeBirdFromOwner(Bird b, Owner o);
	void addToyToBird(Toy t1, Bird b);
}
