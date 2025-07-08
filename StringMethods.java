public class StringMethods {
    public static void main(String[] args) {
        String name = "not Otaku";
        
        System.out.println(name.length());

        System.out.println(name.charAt(5));

        System.out.println(name.equals(name));

        System.out.println(name.equalsIgnoreCase("not otaku"));

        System.out.println(name.substring(5));
        System.out.println(name.substring(5, 6));

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.trim());

        System.out.println(name.replace("not", " !"));
        
    }
}
