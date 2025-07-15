import test.TestPackage;
import test.subpackage.TestSubpackage;

public class PackageTest {
    public static void main(String[] args) {
        TestPackage tp = new TestPackage();
        tp.printSomething();

        TestSubpackage tsp = new TestSubpackage();
        tsp.printSomething();
    }
}
