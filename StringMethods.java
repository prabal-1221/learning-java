public class StringMethods {
    public static void main(String[] args) {
        String name = "not Otaku";
        String name2 = "notOtaku";
        
        System.out.println(name.length());

        System.out.println(name.charAt(5));

        System.out.println(name.equals(name2));

        System.out.println(name.equalsIgnoreCase(name2));

        System.out.println(name.substring(5));
        System.out.println(name.substring(5, 7));

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.trim());

        System.out.println(name.replace("not", " !"));
        System.out.println(name.contains("Otaku"));
        System.out.println(name.startsWith("not"));
        System.out.println(name.endsWith("u"));

        System.out.println("".isEmpty());
        System.out.println("     ".isBlank());

        System.out.println(name.indexOf("o"));

        int a = 100;
        String tmp = String.valueOf(a);
        System.out.println(tmp);

        System.out.println(name.subSequence(5, 8));
    }
}
