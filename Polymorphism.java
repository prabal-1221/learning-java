class Calculator {
    public int add (int a, int b) {
        return a + b;
    }

    public int add (int a, int b, int c) {
        return a + b + c;
    }

    public double add (double a, double b) {
        return a + b;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        // Compile time Polymorphism (Method Overloading)
        Calculator calci = new Calculator();
        System.out.println(calci.add(1, 2));
        System.out.println(calci.add(1, 2, 3));
        System.out.println(calci.add(1.3, 2.3));


        // Runtime Polymorphism (Method Overriding)
        Animal dog = new Dog(); // upcast
        dog.sound();
//        dog.bye()

        Animal cat = new Cat();
        cat.sound();

        Dog newDog = (Dog) dog; // downcast
        newDog.sound();
    }
}
