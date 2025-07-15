package test;

public class Student {
    int id;
    String name;
    int standard;

    public Student() {
        this.id = 1;
        this.name = "Default";
        this.standard = 1;
    }

    public Student(int id, String name, int standard) {
        this.id = id;
        this.name = name;
        this.standard = standard;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (this.id <= 0) {
            this.id = 1;
            System.out.println("Since id is invalid a default id is assigned.");
            return ;
        }

        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            this.name = "Default";
            System.out.println("Since name was empty a default name is assigned.");
            return ;
        }
        this.name = name;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        if (this.standard <= 0) {
            this.standard = 1;
            System.out.println("Since standard is invalid a default standard is assigned.");
            return ;
        }

        this.standard = standard;
    }
}
