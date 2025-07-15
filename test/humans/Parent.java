package test.humans;

public class Parent extends Grandparent{
    public Parent(String name, int age) {
        super(name, age);
        System.out.println("Parent Constructor called.");
    }

    public void parentMethod() {
        System.out.println("Parent Method");
    }
}
