public class MathOperation {
    public static void main(String[] args) {
        int a = 10, b = 11;
        System.out.println(Math.max(a, b));
        System.out.println(Math.min(a, b));

        int c = -10;
        System.out.println(Math.abs(c));

        float d = 1.234f;
        System.out.println(Math.floor(d));
        System.out.println(Math.ceil(d));
        System.out.println(Math.round(d));

        System.out.println(Math.sqrt(10));
        System.out.println(Math.pow(2, 32));
        System.out.println(Math.log(10));
        System.out.println(Math.log10(10));
        System.out.println(Math.sin(Math.PI/2));
        System.out.println(Math.cos(Math.PI));
        System.out.println(Math.log(Math.E));

        System.out.println((int) (Math.random() * 11));
    }
}
