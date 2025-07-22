package Interfaces;

import Interfaces.Animals.Animal;
import Interfaces.Animals.Dog;
import Interfaces.Devices.Camera;
import Interfaces.Devices.Phone;

public class Test {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.eat();
//        dog.sleep();
//        System.out.println(Animal.MAX_AGE);
//        Animal.info();
//        dog.run();

        Phone phone = new Phone();
        phone.takePhoto();
        phone.deletePhoto();
        phone.playMusic();
        phone.stopMusic();
        phone.run();

    }
}
