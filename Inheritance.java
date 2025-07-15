import test.humans.Child;

public class Inheritance {
    public static void main(String[] args) {
//        IDog dog = new IDog();
//        dog.setAge(10);
//        dog.setName("idk");
//        dog.setBreed("ntg");
//
//        System.out.println(dog.getAge());
//        System.out.println(dog.getName());
//        System.out.println(dog.getBreed());
//
//        dog.dogSound();
//        dog.animalSound();
//
//        dog.sayHello();
//
//        IAnimal animal = new IAnimal();
//        animal.sayHello();

        Child child = new Child("John", 10);
        System.out.println(child.getName());
        System.out.println(child.getAge());
    }
}
