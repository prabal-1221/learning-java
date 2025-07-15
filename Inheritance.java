public class Inheritance {
    public static void main(String[] args) {
        IDog dog = new IDog();
        dog.setAge(10);
        dog.setName("idk");
        dog.setBreed("ntg");

        System.out.println(dog.getAge());
        System.out.println(dog.getName());
        System.out.println(dog.getBreed());

        dog.dogSound();
        dog.animalSound();
    }
}
