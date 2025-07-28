class Oops {
    public static void main(String[] args) {
        OopsInheritance obj = new OopsInheritance();
        obj.display();

        OopsInterface obj2 = new OopsImplementation();
        obj2.display(); 
    }
}


class OopsInheritance extends Oops {
    public void display() {
        System.out.println("Inheritance");
    }
}

interface OopsInterface {
    void display(); 
}


class OopsImplementation implements OopsInterface {
    @Override
    public void display() {
        System.out.println("Interface Implementation");
 }
}
