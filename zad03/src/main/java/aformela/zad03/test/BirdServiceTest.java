package aformela.zad03.test;

import org.junit.Test;
import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import aformela.zad03.domain.Bird;
import aformela.zad03.service.BirdService;

public class BirdServiceTest {
	BirdService bs = new BirdService();
	private final String NAME_BIRD_1 = "Dryante";
	private final String NAME_BIRD_2 = "Delain";
	private final String NAME_BIRD_3 = "Danifae";
	private final double WEIGHT_BIRD_1 = 12.5;
	private final double WEIGHT_BIRD_2 = 10.0;
	private final double WEIGHT_BIRD_3 = 8.5;
	private final String DATE_BIRD_1 = "2017-07-07";
	private final String DATE_BIRD_2 = "2016-06-06";
	private final String DATE_BIRD_3 = "2015-05-05";
	private final int COLORS_BIRD_1 = 5;
	private final int COLORS_BIRD_2 = 7;
	private final int COLORS_BIRD_3 = 4;
	
	/*@Test
	public void addBirdTest() throws SQLException {
		Bird b = new Bird(NAME_BIRD_1, DATE_BIRD_1, true, WEIGHT_BIRD_1, COLORS_BIRD_1);
		bs.addBird(b);

		Bird retrievedBird = bs.findByName(b.getName());
		
		assertEquals(NAME_BIRD_1, retrievedBird.getName());
		assertEquals(DATE_BIRD_1, retrievedBird.getDateOfBirth());
	}
	
	@Test
	public void getAllBirdsTest() throws SQLException {
		Bird b1 = new Bird(NAME_BIRD_1, DATE_BIRD_1, true, WEIGHT_BIRD_1, COLORS_BIRD_1);
		Bird b2 = new Bird(NAME_BIRD_2, DATE_BIRD_2, true, WEIGHT_BIRD_2, COLORS_BIRD_2);
		Bird b3 = new Bird(NAME_BIRD_3, DATE_BIRD_3, false, WEIGHT_BIRD_3, COLORS_BIRD_3);
		bs.addBird(b1);
		bs.addBird(b2);
		bs.addBird(b3);

		assertEquals(3, bs.getAllBirds().size());
	}*/
	
	/*@Test
	public void deleteBirdTest() throws SQLException {
		Bird b = new Bird(NAME_BIRD_1, DATE_BIRD_1, true, WEIGHT_BIRD_1, COLORS_BIRD_1);
		bs.addBird(b);

		int count = bs.getAllBirds().size();
		bs.deleteBird(b);

		assertEquals(count-1, bs.getAllBirds().size());
	}*/
	
	@Test
	public void addAllBirdsTest() throws SQLException {
		List<Bird> birds = new ArrayList<Bird>();
		Bird b1 = new Bird(NAME_BIRD_1, DATE_BIRD_1, true, WEIGHT_BIRD_1, COLORS_BIRD_1);
		Bird b2 = new Bird(NAME_BIRD_2, DATE_BIRD_2, true, WEIGHT_BIRD_2, COLORS_BIRD_2);
		Bird b3 = new Bird(NAME_BIRD_3, DATE_BIRD_3, false, WEIGHT_BIRD_3, COLORS_BIRD_3);
		
		birds.add(b1);
		birds.add(b2);
		birds.add(b3);
		
		bs.addAllBirds(birds);

		assertEquals(3, bs.getAllBirds().size());
	}
	
	@Test
	public void deleteAllBirdsTest() throws SQLException {
		bs.deleteAllBirds();
		assertEquals(0, bs.getAllBirds().size());
	}
}
