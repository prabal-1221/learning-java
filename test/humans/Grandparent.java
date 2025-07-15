package test.humans;

public class Grandparent {
    private String name;
    private int age;

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

    public Grandparent(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Grandparent Constructor called.");
    }
}
