public class IDog extends IAnimal{
    private String breed;

    public void dogSound() {
        System.out.println("Dog makes sound.");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void sayHello() {
        System.out.println("Dog: Hello");
    }
}
