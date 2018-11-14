package aformela.zad02.domain;

public class Bird {

	private String name;
	private boolean isFemale;
	private double weight;
	private String  dateOfBirth;
	private int countOfColors;
	
	
	public Bird() {
		super();
	}

	private int id; 
	public Bird(String name, String dateOfBirth, boolean isFemale, double weight, int countOfColors) {
		super();
		this.name = name;
		this.isFemale = isFemale;
		this.weight = weight;
		this.dateOfBirth = dateOfBirth;
		this.countOfColors = countOfColors;
	}

	public Bird(int id, String name, String dateOfBirth, boolean isFemale, double weight, int countOfColors) {
		super();
		this.id = id;
		this.name = name;
		this.isFemale = isFemale;
		this.weight = weight;
		this.dateOfBirth = dateOfBirth;
		this.countOfColors = countOfColors;
	}
	public Bird(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isFemale() {
		return isFemale;
	}
	public void setFemale(boolean isFemale) {
		this.isFemale = isFemale;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCountOfColors() {
		return countOfColors;
	}

	public void setCountOfColors(int countOfColors) {
		this.countOfColors = countOfColors;
	}
	
}
