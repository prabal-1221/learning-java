public class Conditionals {
    public static void main(String[] args) {

        int marks = 85;
        if (marks >= 66) {
            System.out.println("Good.");
        } else if (marks >= 33) {
            System.out.println("Bad.");
        } else {
            System.out.println("Very Bad.");
        }

        char grade = 'A';
        switch (marks) {
            case 'A':
                System.out.println("Good.");
                break;
            case 'B':
                System.out.println("Not Good.");
                break;
            case 'C':
                System.out.println("Bad.");
                break;
            default:
                System.out.println("Very Bad.");
        }

    }
}
