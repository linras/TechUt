package aformela.zad03.service;

import java.util.List;

import aformela.zad03.domain.Bird;

public interface BirdManager {

	public int addBird(Bird bird);
	public List<Bird> getAllBirds();
	
	public void addAllBirds(List<Bird> birds);

}
