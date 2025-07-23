import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandling {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            for (int i=10; i>-1; i--) {
                System.out.println(10/i);
            }
        } catch (Exception e) {
            System.out.println("Exception");
        } finally {
            System.out.println("Yo");
        }

//        FileReader fileReader = new FileReader("a.txt");

        try {
            throw new CustomException();
        } catch (CustomException e) {
            System.out.println(e);
        }
    }
}
