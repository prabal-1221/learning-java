public class User {
    public static int count = 10;

    private String id;
    private String username;

    public final String country = "India";

    public User() {
        count++;
//        country = "I";
    }

    static {
        count = 100;
    }

    public static void getCount() {
        System.out.println(count);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
