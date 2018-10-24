package aformela.zad02.service;

import java.util.List;

import aformela.zad02.domain.Bird;

public interface BirdManager {

	public int addBird(Bird bird);
	public List<Bird> getAllBirds();
	
	/* batch insert - transactional */
	public void addAllPersons(List<Bird> birdss);

}
