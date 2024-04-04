class Animal {
    public void makeSound() {
        System.out.println("Animal makes a generic sound");
    }

    public void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }

    // Method overloading
    public void eat(String food) {
        System.out.println("Dog eats " + food);
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();

        // Method overriding
        animal.makeSound(); // Output: Animal makes a generic sound
        dog.makeSound();    // Output: Dog barks

        // Method overloading
        animal.eat();           // Output: Animal eats food
        dog.eat();              // Output: Animal eats food (inherited method)
        dog.eat("bones");       // Output: Dog eats bones
    }
}
