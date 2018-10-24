package main.aformela.zad02;

import java.sql.SQLException;

import main.aformela.zad02.domain.Bird;
import main.aformela.zad02.service.BirdManager;

public class Main {
	public static void main(String[] args) throws SQLException {

        BirdManager birdManager = new BirdManager();
        Bird bird = new Bird();
        birdManager.addBird(bird);



}
}