public class EnumTrial {
    public static void main(String[] args) {
        System.out.println(Day.FRIDAY);
        Day []days = Day.values();
        for (Day i: days) {
            System.out.println(i);
        }
    }
}
