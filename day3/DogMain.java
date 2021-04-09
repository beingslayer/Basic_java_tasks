package day3;

import java.util.Scanner;

public class DogMain {
	private static String dogName;
	private static int age, weight;

	public static void main(String[] args) {
		Dog d = new Dog();
		Scanner sc = new Scanner(System.in);
		System.out.print("Dog Name:");
		dogName = sc.nextLine();
		d.setName(dogName);
		System.out.print("Dog Age:");
		age = sc.nextInt();
		d.setAge(age);
		System.out.print("Dog Weight:");
		weight = sc.nextInt();
		d.setWeight(weight);
		System.out.println("Choose the below option for your dog");
		System.out.println("\t1.Feed\t 2.Play Games");
		int choice = sc.nextInt();
		if (choice == 1) {
			d.doFeedAnimal();
			weight = d.getWeight();
		} else if (choice == 2) {
			d.playGames();
			weight = d.getWeight();
		} else {
			System.out.println("Invalid Input");
		}
		if (choice == 1 || choice == 2) {
			dogName = d.getName();
			age = d.getAge();
			System.out.println("\n\n******INFORMATION ABOUT DOG******---");
			System.out.println("\tDog name:" + dogName + "\n\tAge:" + age + "\n\tWeight:" + weight);

		}

	}

}
