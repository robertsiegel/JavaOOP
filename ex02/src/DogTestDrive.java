
class Animal {
	int size;
	String breed;
	String name;
}

class Dog extends Animal {
	void bark() {
		System.out.println("Woof! Bark!");
	}
}

class Cat extends Animal {
	void bark() {
		System.out.println("Meow! Meow!");
	}

}


public class DogTestDrive {
	public static void main(String[] args) {
		Dog [] dogs = new Dog[10];
		for(int i=0; i<dogs.length; i++){
			dogs[i] = new Dog();
			dogs[i].name = "Breed " +i;
			dogs[i].size = i;		
		}
		int largest_dog = 0;
		for(int i=0; i<dogs.length; i++){
			if (dogs[largest_dog].size < dogs[i].size){
				largest_dog = i;
			}
		}
		System.out.println(dogs[largest_dog].size);
	}
}


