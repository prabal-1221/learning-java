public class IAnimal {
    private String name;
    private int age;

    public void animalSound() {
        System.out.println("Animal makes sound.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
