public class Loops {
    public static void main(String[] args) {
        String start = "1";
        for (int i=0; i<10; i++) {
            System.out.println(start);
            start += "0";
        }

        start = "1";
        int j=0;
        while (j < 10) {
            System.out.println(start);
            start += "0";
            j += 1;
        }

        start = "1";
        int k = 0;
        do {
            System.out.println(start);
            start += "0";
            k += 1;
        } while (k<10);
    }
}
