package test.humans;

public class Child extends Parent{
    public Child(String name, int age) {
        super(name, age);
        System.out.println("Child Constructor called.");
    }

    public void childMethod() {
        System.out.println("Child Method");
        super.parentMethod();
    }
}
