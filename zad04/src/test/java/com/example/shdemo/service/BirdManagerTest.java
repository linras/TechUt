package com.example.shdemo.service;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.example.shdemo.domain.Bird;
import com.example.shdemo.domain.Owner;
import com.example.shdemo.domain.Tail;
import com.example.shdemo.domain.Toy;

@SuppressWarnings("unused")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/beans.xml" })
@TransactionConfiguration(transactionManager = "txManager", defaultRollback = false)
@Transactional
public class BirdManagerTest {

	@Autowired
	BirdManager bm;

	private final String NAME_TOY_1 = "Blue ball";
	private final String NAME_TOY_2 = "Bambol";
	private final String NAME_TOY_3 = "Nunchaku";
	
	private final String NAME_TAIL_1 = "tailone";
	private final String NAME_TAIL_2 = "tailor";
	private final String NAME_TAIL_3 = "tailthree";
	private final String DESCR_TAIL_1 = "Red tail with long feathers";
	private final String DESCR_TAIL_2 = "Bambol";
	private final String DESCR_TAIL_3 = "Nunchaku";
	
	private final String NAME_OWNER_1 = "Dryante";
	private final String NAME_OWNER_2 = "Delain";
	private final String NAME_OWNER_3 = "Danifae";
	
	private final String NAME_BIRD_1 = "Dryante";
	private final String NAME_BIRD_2 = "Delain";
	private final String NAME_BIRD_3 = "Danifae";
	private final double WEIGHT_BIRD_1 = 12.5;
	private final double WEIGHT_BIRD_2 = 10.0;
	private final double WEIGHT_BIRD_3 = 8.5;
	private final Date DATE_BIRD_1 = new Date(2017, 12, 14);
	private final Date DATE_BIRD_2 = new Date(2000, 12, 14);
	private final Date DATE_BIRD_3 = new Date(2005, 12, 14);
	private final int COLORS_BIRD_1 = 5;
	private final int COLORS_BIRD_2 = 7;
	private final int COLORS_BIRD_3 = 4;
	
	
	@Test
	public void nothing() {}
	
	//____________________________________________________________________________TOYS TESTS:
	/*@Test
	public void addToysTest() {
		Toy t = new Toy(NAME_TOY_1);
		bm.addToy(t);

		Toy retrievedToy = bm.findToyById(t.getId());
		assertEquals(NAME_TOY_1, retrievedToy.getName());
	}*/
    
	/*@Test
	public void getAllToysTest() {
		Toy t1 = new Toy(NAME_TOY_1);
		Toy t2 = new Toy(NAME_TOY_2);
		Toy t3 = new Toy(NAME_TOY_3);
		bm.addToy(t1);
		bm.addToy(t2);
		bm.addToy(t3);

		assertEquals(3, bm.getAllToys().size());
	}
	
	/*@Test
	public void deleteToyTest() {
		Toy t1 = new Toy(NAME_TOY_1);
		bm.addToy(t1);

		int count = bm.getAllToys().size();
		bm.deleteToy(t1);

		assertEquals(count-1, bm.getAllToys().size());
	}*/
	
	//_______________________________________________________________________________TAILS TESTS:
	

	/*@Test
	public void addTailsTest() {
		Tail t = new Tail(NAME_TAIL_1, DESCR_TAIL_1);
		bm.addTail(t);

		Tail retrievedTail = bm.findTailById(t.getId());
		assertEquals(NAME_TAIL_1, retrievedTail.getName());
	}*/
    
	/*@Test
	public void getAllTailsTest() {
		Tail t1 = new Tail(NAME_TAIL_1, DESCR_TAIL_1);
		Tail t2 = new Tail(NAME_TAIL_2, DESCR_TAIL_2);
		Tail t3 = new Tail(NAME_TAIL_3, DESCR_TAIL_3);
		bm.addTail(t1);
		bm.addTail(t2);
		bm.addTail(t3);

		assertEquals(3, bm.getAllTails().size());
	}
	
	/*@Test
	public void deleteTailTest() {
		Tail t = new Tail(NAME_TAIL_1, DESCR_TAIL_1);
		bm.addTail(t);

		int count = bm.getAllTails().size();
		bm.deleteTail(t);

		assertEquals(count-1, bm.getAllTails().size());
	}*/
	//____________________________________________________________________________________OWNER TESTS:
	
	/*@Test
	public void addOwnerTest() {

		Owner o = new Owner(NAME_OWNER_1);
		bm.addOwner(o);

		Owner retrievedOwner = bm.findOwnerById(o.getId());
		assertEquals(NAME_OWNER_1, retrievedOwner.getFirstName());
	}*/

	/*@Test
	public void getAllOwnersTest() {
		Owner o1 = new Owner(NAME_OWNER_1);
		Owner o2 = new Owner(NAME_OWNER_2);
		Owner o3 = new Owner(NAME_OWNER_3);
		bm.addOwner(o1);
		bm.addOwner(o2);
		bm.addOwner(o3);

		assertEquals(3, bm.getAllOwners().size());
	}*/

	/*@Test
	public void deleteOwnerTest() {
		
		Owner o = new Owner(NAME_OWNER_1);
		bm.addOwner(o);

		int count = bm.getAllOwners().size();
		bm.deleteOwner(o);

		assertEquals(count-1, bm.getAllOwners().size());
	}*/
	
	//_____________________________________________________________________________________________BIRD TESTS:
  
	/*@Test
	public void addBirdTest() {
		Bird b = new Bird(NAME_BIRD_1, DATE_BIRD_1, true, WEIGHT_BIRD_1, COLORS_BIRD_1);
		bm.addBird(b);

		Bird retrievedBird = bm.findBirdById(b.getId());
		assertEquals(NAME_BIRD_1, retrievedBird.getName());
		assertEquals(DATE_BIRD_1, retrievedBird.getDateOfBirth());
	}*/
	
    
	/*@Test
	public void getAllBirdsTest() {
		Bird b1 = new Bird(NAME_BIRD_1, DATE_BIRD_1, true, WEIGHT_BIRD_1, COLORS_BIRD_1);
		Bird b2 = new Bird(NAME_BIRD_2, DATE_BIRD_2, true, WEIGHT_BIRD_2, COLORS_BIRD_2);
		Bird b3 = new Bird(NAME_BIRD_3, DATE_BIRD_3, false, WEIGHT_BIRD_3, COLORS_BIRD_3);
		bm.addBird(b1);
		bm.addBird(b2);
		bm.addBird(b3);

		assertEquals(3, bm.getAllBirds().size());
	}*/

	/*@Test
	public void deleteBirdTest() {
		Bird b = new Bird(NAME_BIRD_1, DATE_BIRD_1, true, WEIGHT_BIRD_1, COLORS_BIRD_1);
		bm.addBird(b);

		int count = bm.getAllBirds().size();
		bm.deleteBird(b);

		assertEquals(count-1, bm.getAllBirds().size());
	}*/
	
	//________________________________________________________________________________________________BARDZIEJ ZAAWANSOWANE:
	

	/*@Test
	public void addBirdToOwnerTest(){
		Bird b = new Bird(NAME_BIRD_1, DATE_BIRD_1, true, WEIGHT_BIRD_1, COLORS_BIRD_1);
		bm.addBird(b);

		Owner o = new Owner(NAME_OWNER_1);
		bm.addOwner(o);

		int count = bm.getOwnerBirds(o).size();

		bm.addBirdToOwner(b, o);

		assertEquals(count+1, bm.getOwnerBirds(o).size());
	}*/
	
	/*@Test
	public void removeBirdFromOwnerTest(){
		Bird b = new Bird(NAME_BIRD_1, DATE_BIRD_1, true, WEIGHT_BIRD_1, COLORS_BIRD_1);
		Bird b2 = new Bird(NAME_BIRD_2, DATE_BIRD_2, true, WEIGHT_BIRD_2, COLORS_BIRD_2);
		bm.addBird(b);
		bm.addBird(b2);

		Owner o = new Owner(NAME_OWNER_1);
		bm.addOwner(o);
		
		bm.addBirdToOwner(b, o);
		bm.addBirdToOwner(b2, o);

		int count = bm.getOwnerBirds(o).size();

		bm.removeBirdFromOwner(b, o);
		bm.removeBirdFromOwner(b2, o);

		assertEquals(count-2, bm.getOwnerBirds(o).size());
	}*/


	@Test
	public void findBirdToysTest(){ //phone=toy bird=producer
		Bird b = new Bird(NAME_BIRD_1, DATE_BIRD_1, true, WEIGHT_BIRD_1, COLORS_BIRD_1);
		bm.addBird(b);

		Toy t1 = new Toy(NAME_TOY_1);
		Toy t2 = new Toy(NAME_TOY_2);
		Toy t3 = new Toy(NAME_TOY_3);
		bm.addToy(t1);
		bm.addToy(t2);
		bm.addToy(t3);

		bm.addToyToBird(t1, b);
		bm.addToyToBird(t2, b);
		bm.addToyToBird(t3, b);

		int count = bm.findBirdToys(b).size();

		assertEquals(3, count);
	}
	
	
}
