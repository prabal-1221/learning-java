import test.Student;

public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.getId());
        System.out.println(s1.getName());
        System.out.println(s1.getStandard());

        System.out.println("------------------");

        Student s2 = new Student(5, "not Otaku", 16);
        System.out.println(s2.getId());
        System.out.println(s2.getName());
        System.out.println(s2.getStandard());
    }
}
