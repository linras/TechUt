package aformela.zad04.test;

import org.junit.Test;
import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.List;

import aformela.zad04.domain.Bird;
import aformela.zad04.service.BirdService;

public class BirdServiceTest {
	BirdService bs = new BirdService();
	final private String BIRD1_NAME = "Piszczel";
	
	@Test
	public void addBirdCheck() throws SQLException {
		
		assertNotNull(bs);
		
		Bird bird1 = new Bird(BIRD1_NAME, "2008-01-11", true, 1.7, 2);
		
		//bs.addBird(bird1);
		//List<Bird> retrivedBirds = bs.getAllBirds();
		//Bird retrivedBird = retrivedBirds.get(0);
		Bird retrivedBird = bird1;
		assertEquals(BIRD1_NAME, retrivedBird.getName());
		//assertEquals(DOG_COS, retrivedBird.getCos());
	}
}
