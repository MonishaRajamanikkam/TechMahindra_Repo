package tm;

abstract class Animal {
	    // Abstract method to be implemented by subclasses
	    abstract void makeSound();
	}

//Concrete subclass Dog extending Animal
	class Dog extends Animal {
	    // Overriding the makeSound() method
	    @Override
	    void makeSound() {
	        System.out.println("The dog is barking: Wow! Wow!");
	    }
	}

