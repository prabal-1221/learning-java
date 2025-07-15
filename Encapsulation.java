import test.Student;

public class Encapsulation {
    public static void main(String[] args) {
        Student s = new Student();
        s.setId(1);
        s.setName("not Otaku");
        s.setStandard(16);

        System.out.println(s.getId());
        System.out.println(s.getName());
        System.out.println(s.getStandard());
    }
}
