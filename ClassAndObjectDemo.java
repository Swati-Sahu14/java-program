// Example: Classes and Objects in Java
class Student {
    // Attributes (data members)
    int id;
    String name;
    int age;

    // Method (member function)
    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
    }
}

public class ClassAndObjectDemo {
    public static void main(String[] args) {
        // Creating first object
        Student s1 = new Student();
        s1.id = 101;
        s1.name = "Rahul";
        s1.age = 20;

        // Creating second object
        Student s2 = new Student();
        s2.id = 102;
        s2.name = "Anita";
        s2.age = 22;

        // Calling method
        s1.display();
        s2.display();
    }
}
