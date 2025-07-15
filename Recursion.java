public class Recursion {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(sumOfN(10));
    }

    private static int sumOfN(int i) {
        if (i == 1) {
            return 1;
        }
        return i + sumOfN(i-1);
    }

    private static int factorial(int i) {
        if (i == 0) {
            return 1;
        }
        return i * factorial(i-1);
    }
}
