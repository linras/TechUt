package com.example.shdemo.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.example.shdemo.domain.Bird;
import com.example.shdemo.domain.Owner;
import com.example.shdemo.domain.Tail;
import com.example.shdemo.domain.Toy;

@Component
@Transactional
public class BirdManagerImplemet implements BirdManager {

	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void addBird(Bird b) {
		//b.setId(null);
		//sessionFactory.getCurrentSession().persist(b);
		sessionFactory.getCurrentSession().save(b);
	}
	

	@SuppressWarnings("unchecked")
	@Override
	public List<Bird> getAllBirds() {
        return sessionFactory.getCurrentSession().getNamedQuery("bird.findAll").list();
	}

	@Override
	public Bird findBirdByName(String name) {
        return (Bird) sessionFactory.getCurrentSession().get(Bird.class, name);
	}

	@Override
	public Bird findBirdById(Long id) {
        return (Bird) sessionFactory.getCurrentSession().get(Bird.class, id);
	}

	@Override
	public void addOwner(Owner owner) {
		sessionFactory.getCurrentSession().save(owner);
		
	}

	@Override
	public void deleteOwner(Owner owner) {
        owner = (Owner) sessionFactory.getCurrentSession().get(Owner.class,
                owner.getId());
        sessionFactory.getCurrentSession().delete(owner);
	}

	@Override
	public Owner findOwnerById(Long id) {
        return (Owner) sessionFactory.getCurrentSession().get(Owner.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Owner> getAllOwners() {
        return sessionFactory.getCurrentSession().getNamedQuery("owner.findAll").list();
	}


	@Override
	public void addToy(Toy toy) {
		sessionFactory.getCurrentSession().save(toy);
		
	}

	@Override
	public void deleteToy(Toy toy) {
        toy = (Toy) sessionFactory.getCurrentSession().get(Toy.class,
                toy.getId());
        sessionFactory.getCurrentSession().delete(toy);
		
	}

	@Override
	public Toy findToyById(Long id) {
        return (Toy) sessionFactory.getCurrentSession().get(Toy.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Toy> getAllToys() {
        return sessionFactory.getCurrentSession().getNamedQuery("toy.findAll").list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Toy> findBirdToys(Bird bird) {
        return sessionFactory.getCurrentSession().getNamedQuery("bird.findBirdToys").setLong("id", bird.getId()).list();
	}

	@Override
	public void addTail(Tail tail) {
		sessionFactory.getCurrentSession().save(tail);
		
	}

	@Override
	public void deleteTail(Tail tail) {
        tail = (Tail) sessionFactory.getCurrentSession().get(Tail.class,
                tail.getId());
        sessionFactory.getCurrentSession().delete(tail);
		
	}

	@Override
	public Tail findTailById(Long id) {
        return (Tail) sessionFactory.getCurrentSession().get(Tail.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Tail> getAllTails() {
        return sessionFactory.getCurrentSession().getNamedQuery("tail.findAll").list();
	}


	@Override
	public List<Bird> getOwnerBirds(Owner owner) {
        owner = (Owner) sessionFactory.getCurrentSession().get(Owner.class,
                owner.getId());
        List<Bird> birds = new ArrayList<Bird>(owner.getBirdList());
        return birds;
	}

	@Override
	public void deleteBird(Bird bird) {
        bird = (Bird) sessionFactory.getCurrentSession().get(Bird.class,
                bird.getId());
        sessionFactory.getCurrentSession().delete(bird);
		
	}

	@Override
	public void addBirdToOwner(Bird b, Owner o) {
        List<Bird> birds = o.getBirdList();
        birds.add(b);
        o.setBirdList(birds);
        sessionFactory.getCurrentSession().save(o);
		
	}

	@Override
	public void removeBirdFromOwner(Bird b, Owner o) {
        List<Bird> birds = o.getBirdList();
        birds.remove(b);
        o.setBirdList(birds);
        sessionFactory.getCurrentSession().save(o);
		
	}

	@Override
	public void addToyToBird(Toy t, Bird b) {
        List<Toy> toys = b.getToyList();
        toys.add(t);
        b.setToyList(toys);
        sessionFactory.getCurrentSession().save(b);
		
	}
	
}
