public class Dog extends Animal{
    String breed;

    @Override
    public void sound() {
        System.out.println("Dog makes sound.");
    }

    public void bye() {
        System.out.println("Dog says Bye.");
    }
}
