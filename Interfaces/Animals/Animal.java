package Interfaces.Animals;

public interface Animal {
    int MAX_AGE = 12;
    void eat();
    void sleep();

    static void info() {
        System.out.println("This is an Animal Interface.");
    }

    default void run() {
        this.eat();
        System.out.println("Animal is running.");
    }
}
