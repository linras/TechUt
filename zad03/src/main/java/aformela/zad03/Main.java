package aformela.zad03;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import aformela.zad03.domain.Bird;
import aformela.zad03.service.BirdService;

public class Main {
	public static void main(String[] args) throws SQLException {

        BirdService birdService = new BirdService();
        

        List<Bird> birds = new ArrayList<>();
        
        
        Bird bird1 = new Bird("Paprotka", "1997-02-11", true, 1.2, 5);	// 
        Bird bird2 = new Bird("Krakers", "2017-03-02", false, 2.2, 7);	
        Bird bird3 = new Bird("Piszczel", "2008-01-11", true, 1.7, 2);	
        /*birdService.addBird(bird1);
        birdService.addBird(bird2);
        birdService.addBird(bird3);*/
        birdService.deleteAllBirds();
        /*birdService.deleteBird(bird1);
        birdService.deleteBird(bird2);
        birdService.deleteBird(bird3);*/
        birds.add(bird1);
        birds.add(bird2);
        birds.add(bird3);
        
        System.out.println(birdService.addAllBirds(birds));
        System.out.println(birdService.findByName("Piszczel").toString());
        /*
        Bird bird4= new Bird("Panaceum:", "1997-02-11", false, 1.2, 5);	// 
        Bird bird5 = new Bird("Krowa:", "2017-03-02", true, 2.2, 7);	
        Bird bird6 = new Bird("Bambol:", "2008-01-11", false, 1.7, 2);	
        
        List<Bird> birds2 = new ArrayList<>();
        birds.add(bird4);
        birds.add(bird2);
        birds.add(bird5);
        
        */
        //System.out.println(birdService.deleteBird(bird6));
        
}
}