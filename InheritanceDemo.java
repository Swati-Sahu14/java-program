// Single Inheritance
class Animal {
    void eat() {
        System.out.println("Animal eats food.");
    }
}

class Dog extends Animal { // Single Inheritance
    void bark() {
        System.out.println("Dog barks.");
    }
}

// Multilevel Inheritance
class Puppy extends Dog { // Inherits Dog → Animal
    void play() {
        System.out.println("Puppy plays.");
    }
}

// Hierarchical Inheritance
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows.");
    }
}

// Multiple Inheritance using Interface
interface Swimmer {
    void swim();
}

interface Runner {
    void run();
}

class Person implements Swimmer, Runner {
    public void swim() {
        System.out.println("Person swims.");
    }
    public void run() {
        System.out.println("Person runs.");
    }
}

// Main class
public class InheritanceDemo {
    public static void main(String[] args) {
        // Single
        Dog d = new Dog();
        d.eat();
        d.bark();

        // Multilevel
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.play();

        // Hierarchical
        Cat c = new Cat();
        c.eat();
        c.meow();

        // Multiple (via interface)
        Person per = new Person();
        per.swim();
        per.run();
    }
}
