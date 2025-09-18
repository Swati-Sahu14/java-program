class Calculator {
    // add two numbers
    int add(int a, int b) {
        return a + b;
    }

    // add three numbers (same method name, different parameters)
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

// -------- Runtime Polymorphism (Overriding) --------
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// -------- Main Class --------
public class PolymorphismDemo {
    public static void main(String[] args) {
        // Compile-time Polymorphism
        Calculator calc = new Calculator();
        System.out.println("Sum of 2 numbers: " + calc.add(10, 20));
        System.out.println("Sum of 3 numbers: " + calc.add(5, 15, 25));

        System.out.println("---- Runtime Polymorphism ----");

        // Runtime Polymorphism
        Animal a; // reference variable of parent class

        a = new Dog();  // object of Dog
        a.sound();      // Dog's sound

        a = new Cat();  // object of Cat
        a.sound();      // Cat's sound
    }
}
