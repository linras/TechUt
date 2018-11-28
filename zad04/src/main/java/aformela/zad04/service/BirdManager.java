package aformela.zad04.service;

import java.util.List;

import aformela.zad04.domain.Bird;

public interface BirdManager {

	public int addBird(Bird bird);
	public List<Bird> getAllBirds();
	
	public void addAllBirds(List<Bird> birds);

}
