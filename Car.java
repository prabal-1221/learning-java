public class Car {
    private String color;
    private String model;
    private int year;
    private int speed = 0;

    public void accelerate(int a, int t) {
        this.speed += a*t;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void brake(int a, int t) {
        this.speed -= a*t;
        if (this.speed < 0) {
            this.speed = 0;
        }
    }
}
