/**
 * 
 * @author Robbie Siegel
 */

import java.util.ArrayList;

class Animal {
	private int size;
	String breed;
	String name;
	
	int getSize() {
		return this.size;
	}
	void setSize(int newSize) {
		this.size = newSize;
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("Woof! Bark!");
	}
	boolean isBigger(Dog otherDog) {
		if (this.getSize() > otherDog.getSize()) {
			return true;
		}
		else {
			return false;
		}
	}
}

class Cat extends Animal {
	void bark() {
		System.out.println("Meow! Meow!");
	}

}

class DogPack {
	private ArrayList<Dog> dogs;
	
	/** Makes an array of Dog objects
	 * 
	 * @param size: the size of the dog array list
	 */
	public void makeArray(int size){
		dogs = new ArrayList<Dog>(size);
		
	}
	
	/** Adds a Dog to the array
	 * 
	 * @param index: index to add the dog at
	 * @param newDog: the new Dog to add to the array
	 */
	public void addDog(Dog newDog, int index){
		dogs.add(index, newDog);
	}
	
	/**Finds the biggest Dog in a DogPack
	 * 
	 * @return the Dog with the biggest size
	 */
	public Dog biggestDog(){
		int biggestDog = 0;
		for (int i=1; i<dogs.size(); i++) {
			if (dogs.get(i).isBigger(dogs.get(biggestDog))) {
				biggestDog = i;
			}
		}
		return dogs.get(biggestDog);
	}
}

public class DogTestDrive {
	public static void main(String[] args) {
		int[] sizes = {4, 21, 59, 53, 11, 19};
		DogPack pack = new DogPack();
		pack.makeArray(sizes.length);
		for(int i=0; i<sizes.length; i++){
			Dog dog = new Dog();
			dog.setSize(sizes[i]);
			pack.addDog(dog, i);
			}
		System.out.println(pack.biggestDog().getSize());
	}

}


