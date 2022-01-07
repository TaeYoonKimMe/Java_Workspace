package chapter7;

import java.util.ArrayList;

public class DogTestArrayList {
	public static void main(String[] args) {
		ArrayList<Dog> dogs = new ArrayList<Dog>();

		dogs.add(new Dog("d1", "t1"));
		dogs.add(new Dog("d2", "t2"));
		dogs.add(new Dog("d3", "t3"));
		dogs.add(new Dog("d4", "t4"));
		dogs.add(new Dog("d5", "t5"));

		for (Dog d : dogs)
			System.out.println(d.showDogInfo());
	}

}
