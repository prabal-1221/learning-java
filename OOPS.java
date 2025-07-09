public class OOPS {
    public static void main(String[] args) {
        Car car = new Car();

        car.setColor("red");
        car.setModel("bmw");
        car.setYear(2023);

        car.accelerate(2, 10);
        System.out.println("current speed: " + car.getSpeed());

        car.brake(1, 5);
        System.out.println("current speed: " + car.getSpeed());

        //----------------------------------------------------------------
        Animal dog = new Dog();
        dog.sound();
    }
}
