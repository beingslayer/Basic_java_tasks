package day3;

public class Dog {

	private String name;
	private int age;
	private int weight;

	public void setName(String name) {
		this.name = name;

		// current calling object
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		// --- business operation ---
		// non-functional requirements ----
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
		// System.out.println(this.weight);
	}

	// Business method
	public void doFeedAnimal() {
		this.weight += 10;
	}

	public void playGames() {

		// dog cannot playGames if weight is less than 2Kg or more than 30Kg

		// whenever dog playGame weight will be decreased by 1kg
		if (weight < 2 || weight > 30) {
			System.out.println(name+"cannot play the Game...");
		} else {
			weight = weight - 1;
		}
	}

}